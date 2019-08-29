package com.how2java.tmall.web;


import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.UserService;
import com.how2java.tmall.util.Page4Navigator;
import com.how2java.tmall.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

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

    @GetMapping("/users")
    public Page4Navigator<User> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<User> page = userService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable("id") int id) throws Exception {
        User bean = userService.get(id);
        return bean;
    }

    @PostMapping("/users")
    public Object add(@RequestBody User bean) throws Exception {
        //bean.setCreateDate(new Date());
        userService.add(bean);
        return bean;
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") int id, HttpServletRequest request)  throws Exception {
        userService.delete(id);
        return null;
    }

    @PutMapping("/users")
    public Object update(@RequestBody User bean) throws Exception {
        userService.update(bean);
        return bean;
    }


}
