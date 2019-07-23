package com.chryl.realm;

import com.chryl.mapper.GmFunctionMapper;
import com.chryl.mapper.GmRoleMapper;
import com.chryl.mapper.GmUserMapper;
import com.chryl.po.GmFunction;
import com.chryl.po.GmRole;
import com.chryl.po.GmUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By Chr on 2019/7/23.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private GmUserMapper gmUserMapper;
    @Resource
    private GmFunctionMapper gmFunctionMapper;
    @Autowired
    private GmRoleMapper gmRoleMapper;

    //权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //获取用户对象
        GmUser user = (GmUser) principals.getPrimaryPrincipal();
        System.err.println(user);
        //获取用户权限列表
        List<String> perms = new ArrayList<>();
        List<String> roles = new ArrayList<>();
        //根据用户id获取权限类别
        List<GmFunction> gmFunctions = gmFunctionMapper.findFunByUserId(user.getUserId());
        //根据id获得角色
        List<GmRole> gmRoles = gmRoleMapper.finRoleByUserId(user.getUserId());
        if (gmFunctions != null) {
            for (GmFunction func : gmFunctions) {
                perms.add(func.getFunCode());
            }
        }
        if (gmRoles != null) {
            for (GmRole gmRole : gmRoles) {
                roles.add(gmRole.getRoleName());
            }
        }

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(perms); //把用户的所有权限类别添加到对象中
        authorizationInfo.addRoles(roles); //把所有的用户角色添加到对象中


        return authorizationInfo;
    }

    //认证,登陆
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        System.out.println("username:" + username);
        //需要通过用户名查询用户密码
        GmUser gmUser = gmUserMapper.selectUserByUserName(username);
        String password = gmUser.getUserPassword();
        //把用户名和密码封装到AuthenticationInfo对象中
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(gmUser, password, "shiroRealm");

        return authenticationInfo;
    }
}
