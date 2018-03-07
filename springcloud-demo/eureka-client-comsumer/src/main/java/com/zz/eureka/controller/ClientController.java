package com.zz.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("client")
    public String fetchServer() {
        System.out.println(11111);
        String res = restTemplate.getForObject("http://service-provider/getUser/2", String.class);
        System.out.println(res);
        return res;
    }
}
