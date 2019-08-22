package com.how2java.tmall.web;


import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.UserService;
import com.how2java.tmall.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@RestController
public class UsertController {

    @Autowired
    UserService userService;


    @PostMapping("/login")
    public Object login(@RequestBody User userParam, HttpSession session) {
        String name =  userParam.getName();
        name = HtmlUtils.htmlEscape(name);
//        System.out.println(name + "test");
//        System.out.println(userParam.getPassword() + "test");

        User user =userService.get(name,userParam.getPassword());

//        System.out.println(user.getName() + "  test");
//        System.out.println(user.getPassword() + "  test");


        if(null==user){
            String message ="账号密码错误";
            return Result.fail(message);
        }
        else{
            session.setAttribute("user", user);
           // System.out.println("输出成功的密码：" + Result.success());
            return Result.success();
        }
    }



}
