package com.zz.springboot.web.controller;

import com.google.common.collect.Lists;
import com.zz.springboot.domain.hq.User;
import com.zz.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    public static void main(String[] args) {
        List<Integer> aa = Lists.newArrayList(1, 3, -5, 30, 38, 19, 22);
        aa.stream().map(x -> x * x).forEach(System.out::println);

        Integer sum = aa.stream().filter(a -> a > 15).reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }
}
