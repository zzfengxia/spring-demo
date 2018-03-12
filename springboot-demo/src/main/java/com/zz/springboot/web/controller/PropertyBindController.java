package com.zz.springboot.web.controller;

import com.google.common.collect.ImmutableMap;
import com.zz.springboot.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Francis.zz on 2018/3/9.
 */
@RestController
public class PropertyBindController {
    @Value("${my.secret}")
    private String secretValue;
    @Value("${my.number}")
    private Integer intValue;
    @Value("${my.bignumber}")
    private Long longValue;
    @Value("${my.number.less.than.ten}")
    private Integer lessValue;
    @Value("${my.number.in.range}")
    private Integer rangeValue;
    @Value("${my.argList[0]}")
    private String argList;
    @Value("${conf.name}")
    private String confName;

    @Autowired
    private MyConfig config;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("getRandom")
    public Map getRandom() {
        return ImmutableMap.of(
                "secretValue", secretValue,
                "intValue", intValue,
                "longValue", longValue,
                "lessValue", lessValue,
                "rangeValue", rangeValue
        );
    }

    @RequestMapping("getList")
    public List<String> getList() {
        return config.getArgList();
    }

    @RequestMapping("getProfiles")
    public String getProfiles() {
        return confName;
    }

    /**
     * 松散绑定
     */
    @RequestMapping("RelaxedBinding")
    public MyConfig RelaxedBinding() {
        return config;
    }

    @RequestMapping("getCache")
    public String getCache() {
        return redisTemplate.opsForValue().get("profile");
    }
}
