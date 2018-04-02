package com.zz.springboot.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Service

/**
 * groovy类，混合语言编程Demo
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-15 11:14
 * --------------------------------
 */
@Service
class HelloService {
    @Autowired
    private StringRedisTemplate redisTemplate

    public String getCache(String key) {
        return redisTemplate.opsForValue().get(key)
    }
}
