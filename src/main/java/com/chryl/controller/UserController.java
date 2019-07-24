package com.chryl.controller;

import com.alibaba.fastjson.JSONObject;
import com.chryl.mapper.GmUserMapper;
import com.chryl.po.GmUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By Chr on 2019/7/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private GmUserMapper gmUserMapper;

    @PostMapping("/login")
    public Object login(@RequestParam String username, @RequestParam String password) {
        // 进行登录验证
        Subject subject = SecurityUtils.getSubject();
        // 创建验证用的令牌对象,rememberMe通过前端选择框传入
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);
        JSONObject jsonObject = new JSONObject();
        try {
            subject.login(token);
            //#############################
            boolean remembered = subject.isRemembered();

            System.out.println("是否记住:" + remembered);
            Session session = subject.getSession();
            Serializable id = session.getId();
            System.out.println(id);
            Date startTimestamp = session.getStartTimestamp();
            System.out.println("启动时间" + startTimestamp);
            long timeout = session.getTimeout();
            System.out.println("timeout:" + timeout);
            session.touch();
            Date startTimestam2p = session.getStartTimestamp();
            System.out.println("更新之后的时间" + startTimestam2p);
            //#############################
            boolean flag = subject.isAuthenticated();//是否通过验证
            if (flag) {
                GmUser gmUser = (GmUser) subject.getPrincipal();
                jsonObject.put("msg", gmUser);
            } else {
                jsonObject.put("msg", "login fial");
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg", "login fial");
            return jsonObject;
        }
        return jsonObject;
//        return "redirect:query";
    }

    /**
     * shiro:注解模式:需要在shiroConfig配置文件配置注解开启,和aop开启,
     * 加了@RequiresPermissions 就会根据设置的perms来进行校验权限是否访问
     * 如果不加任何注解,则登陆成功就可以访问
     */

    //#############################
    @GetMapping("/query")
    @RequiresPermissions({"system"})
    public Object query() {

        return "user查询";
    }

    @RequiresPermissions("user:manager")
    @GetMapping("/delete")
    public Object delete() {

        return "user删除";
    }

    @GetMapping("/insert")
//    @RequiresPermissions("system")
    @RequiresRoles("acv")
    public Object insert() {

        return "user增加设备";
    }

    @GetMapping("/update")
    public Object update() {

        return "user修改";
    }

    @GetMapping("/error")
    public Object error() {

        return "user无权访问";
    }

}
