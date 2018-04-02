package com.zz.springboot.web.controller.mybatis;

import com.zz.springboot.domain.mybatis.User;
import com.zz.springboot.service.mybatis.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return userService.fingOne(id);
    }
}
