package com.cloud.controller;

import com.cloud.service.UserService;
import com.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/api/user/{uid}")
    public User findUserById(@PathVariable("uid") Integer uid) {

        System.err.println("我被调用了");
        return userService.getUserById(uid);

    }

}
