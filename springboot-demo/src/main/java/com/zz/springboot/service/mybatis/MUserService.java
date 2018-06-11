package com.zz.springboot.service.mybatis;

import com.zz.springboot.domain.mybatis.User;
import com.zz.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * --------------------------------
 * create by Intellij IDEA.
 *
 * @author Francis.zz
 * @date 2018-03-15 09:29
 * --------------------------------
 */
@Service
public class MUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * springboot 2缓存。
     * 通过配置指定缓存工具, 可以通过{@link org.springframework.cache.CacheManager}配置缓存策略
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user")
    public User fingOne(Long id) {
        return userMapper.findOne(id);
    }

    public void cacheHotData(Map<String, String> hot) {
        String key = "cache:hot:hash";
        redisTemplate.opsForHash().putAll(key, hot);
    }
}
