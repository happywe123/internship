package com.how2java.tmall.web;

import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.UserService;
import com.how2java.tmall.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;


public class LoginController {
    @Autowired
    UserService userService;


    @PostMapping("/login")
    public Object login(@RequestBody User userParam, HttpSession session) {
        String name =  userParam.getName();
        name = HtmlUtils.htmlEscape(name);

        User user = userService.get(name,userParam.getPassword());
//        System.out.println(user.getName());
//        System.out.println(user.getPassword());
        if(null==user){
            String message ="账号密码错误";
            System.out.println('1');
            return Result.fail(message);
        }
        else{
            session.setAttribute("user", user);
            return Result.success();
        }
    }
}
