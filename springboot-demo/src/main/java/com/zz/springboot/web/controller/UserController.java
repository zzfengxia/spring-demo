package com.zz.springboot.web.controller;

import com.zz.springboot.domain.User;
import com.zz.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Francis.zz on 2018/3/13.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findOne")
    public User findOne(Long id) {
        return userService.findOne(id);
    }

    @PostMapping("register")
    public User register(User user) {
        userService.register(user);

        return user;
    }
}
