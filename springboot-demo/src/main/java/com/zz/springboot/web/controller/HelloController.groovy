package com.zz.springboot.web.controller

import com.zz.springboot.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * groovy类，混合语言编程Demo
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-15 11:17
 * --------------------------------
 */
@Controller
@RequestMapping
class HelloController {
    @Autowired
    private HelloService helloService

    @RequestMapping("hello")
    String hello(Model model) {
        model.addAttribute("userName", "Francis")

        return "index"
    }
}
