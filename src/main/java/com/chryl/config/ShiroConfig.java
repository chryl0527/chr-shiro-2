package com.chryl.config;

import com.chryl.realm.MyShiroRealm;
import com.chryl.session.MySessionManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.crazycake.shiro.*;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Chr on 2019/7/23.
 */
@Configuration
public class ShiroConfig {

    //添加创建securityManager的工厂类注入bean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);


        Map<String, String> perms = new HashMap<String, String>();
        /**
         * 设置权限认证过滤器:路径,过滤器
         * anon : 可以匿名访问
         * authc: 必须通过认证，授权后才能访问
         */
        //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了
        perms.put("/logout", "logout");
        perms.put("/user/login", "anon");//login不认证
        perms.put("/user/error", "anon");//login不认证
        perms.put("/login.html", "anon");
        perms.put("/index.html", "anon");

        //权限过滤
//        perms.put("/**", "perms[system]");
//        perms.put("/**", "roles[system]");
//        perms.put("/user/**", "perms[user:manager]");
//        perms.put("/sb/**", "perms[user:manager]");
//        perms.put("/user/**", "perms[sb:manager]");
//        perms.put("/sb/**", "perms[sb:manager]");

        //<!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        perms.put("/**", "authc");

        //没有授权通过访问的地址
        shiroFilterFactoryBean.setLoginUrl("/user/error");

        // 登录成功后要跳转的链接
//        shiroFilterFactoryBean.setSuccessUrl("/user/query");

        //未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/error.html");

        //把权限过滤map设置shiroFilterFactoryBean
        shiroFilterFactoryBean.setFilterChainDefinitionMap(perms);


        return shiroFilterFactoryBean;
    }

    //创建SecurityManager类的注入bean
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") MyShiroRealm shiroRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //自定义 realm
        securityManager.setRealm(shiroRealm);
        // 自定义session管理 使用redis
        securityManager.setSessionManager(sessionManager());
        // 自定义缓存实现 使用redis
        securityManager.setCacheManager(cacheManager());
        //注入记住我管理器;
//        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    //创建自定义realm域类的注入bean
    @Bean(name = "shiroRealm")
    public MyShiroRealm getMyShiroRealm() {
        MyShiroRealm shiroRealm = new MyShiroRealm();
        return shiroRealm;
    }


    /**
     * 开启Shiro注解(如@RequiresRoles,@RequiresPermissions),
     * 需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor)
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    /**
     * 开启aop注解支持
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    //自定义sessionManager
    @Bean
    public SessionManager sessionManager() {
        MySessionManager mySessionManager = new MySessionManager();
        mySessionManager.setSessionDAO(redisSessionDAO());
        return mySessionManager;
    }

    /**
     * 配置shiro redisManager
     * <p>
     * 使用的是shiro-redis开源插件
     *
     * @return
     */
    @Value("${spring.redis.shiro.host}")
    private String host;
    @Value("${spring.redis.shiro.port}")
    private int port;
    @Value("${spring.redis.shiro.timeout}")
    private int timeout;
    @Value("${spring.redis.shiro.password}")
    private String password;

    @Bean
    public RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost(host);
        redisManager.setPort(port);
        redisManager.setExpire(1800);// 配置缓存过期时间
        redisManager.setTimeout(timeout);
        redisManager.setPassword(password);
        redisManager.setDatabase(2);

        return redisManager;
    }

    /**
     * cacheManager 缓存 redis实现,被redisManager管理
     * <p>
     * 使用的是shiro-redis开源插件
     *
     * @return
     */
    public RedisCacheManager cacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        //序列化
        redisCacheManager.setKeySerializer(new ObjectSerializer());
        redisCacheManager.setValueSerializer(new ObjectSerializer());

        return redisCacheManager;
    }

    /**
     * RedisSessionDAO shiro sessionDao层的实现 通过redis.,被redisManager管理
     * <p>
     * 使用的是shiro-redis开源插件
     */
    @Bean
    public RedisSessionDAO redisSessionDAO() {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        return redisSessionDAO;
    }

}
