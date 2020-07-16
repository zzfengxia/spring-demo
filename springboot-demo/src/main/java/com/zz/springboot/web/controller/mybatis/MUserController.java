package com.zz.springboot.web.controller.mybatis;

import com.google.common.collect.ImmutableMap;
import com.zz.springboot.domain.mybatis.User;
import com.zz.springboot.service.mybatis.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * --------------------------------
 * create by Intellij IDEA.
 *
 * @author Francis.zz
 * @date 2018-03-15 09:33
 * --------------------------------
 */
@RestController
@RequestMapping("mybatis")
public class MUserController {
    @Autowired
    private MUserService userService;

    @RequestMapping("findOne/{id}")
    public User findOne(@PathVariable("id") Long id) {
        User user = userService.fingOne(id);

        if (user != null) {
            System.out.println(user.getcTime());
            Map hot = ImmutableMap.of(
                    "userName", user.getUsername(),
                    "email", user.getEmail()
            );
            userService.cacheHotData(hot);
        }

        return user;
    }
}
