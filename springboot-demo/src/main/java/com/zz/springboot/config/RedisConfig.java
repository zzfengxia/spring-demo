package com.zz.springboot.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zz.springboot.constant.Constants;
import com.zz.springboot.util.RedisHelper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 17:44
 * @desc redis缓存配置。自定义key生成格式，自定义序列化方式等。
 * ************************************
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        om.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        return om;
    }

    /**
     * 自定义RedisTemplate配置覆盖默认redis注入
     * 查看默认配置{@link org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration}
     *
     * @return
     */
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, String> cusRedisTemplate = new StringRedisTemplate();
        // 使用FastJson序列化value
        GenericFastJsonRedisSerializer jsonRedisSerializer = new GenericFastJsonRedisSerializer();
        cusRedisTemplate.setValueSerializer(jsonRedisSerializer);
        cusRedisTemplate.setHashValueSerializer(jsonRedisSerializer);

        cusRedisTemplate.setConnectionFactory(factory);
        // 手动初始化
        cusRedisTemplate.afterPropertiesSet();

        return cusRedisTemplate;
    }

    /**
     * 重写{@link CachingConfigurerSupport}类，自定义{@link org.springframework.cache.annotation.Cacheable}的缓存KEY生产策略
     *
     * @return
     */
    @Override
    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder sb = new StringBuilder();
            for(Object arg : params) {
                if(arg instanceof String || arg instanceof Long) {
                    sb.append(arg);
                }
            }
            return RedisHelper.redisCacheKey(sb.toString(), target.getClass());
        };
    }

    /**
     * 自定义Cacheable注解的缓存管理
     * 覆盖{@link org.springframework.boot.autoconfigure.cache.RedisCacheConfiguration}的默认CacheManager注入
     *
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory factory) {
        // 使用FastJson序列化value
        GenericFastJsonRedisSerializer jsonRedisSerializer = new GenericFastJsonRedisSerializer();

        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                // 默认缓存时间
                .entryTtl(Duration.ofMillis(Constants.DEFAULT_CACHE_TIME))
                .disableCachingNullValues()
                // 自定义redisKey的前缀
                .computePrefixWith(cacheName -> cacheName.concat(":"))
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jsonRedisSerializer));

        return RedisCacheManager.builder(factory)
                .cacheDefaults(cacheConfiguration)
                .build();
    }
}
