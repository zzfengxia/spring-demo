package com.zz.springboot.web.controller

import com.zz.springboot.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * groovy类，混合语言编程Demo
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-15 11:17
 * --------------------------------
 */
@RestController
@RequestMapping("groovy")
public class HelloController {
    @Autowired
    private HelloService helloService

    @RequestMapping("hello")
    public String hello() {
        return helloService.getCache("test")
    }
}
