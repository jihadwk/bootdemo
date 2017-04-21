package com.wk.boot.controller;

import com.wk.boot.entity.User;
import com.wk.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest 风格 控制器
 * Created by wukai on 2017/4/20.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id){
        User user = new User();
        user.setId(id);
        user.setName("wk");
        return user;
    }
    @RequestMapping("/getProperty")
    public String get(){
        return userService.getDesc();
    }
}
