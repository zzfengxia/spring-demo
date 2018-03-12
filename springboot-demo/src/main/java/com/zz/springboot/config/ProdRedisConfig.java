package com.zz.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by Francis.zz on 2018/3/12.
 * 定义Beans profiles，根据环境激活不同的配置
 */
@Configuration
@Profile("prod")
public class ProdRedisConfig {
    @Bean
    public StringRedisTemplate getStringRedisTemplate() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("192.168.1.206");
        factory.setPassword("root");
        // 如果是人工创建的factory，需要调用afterPropertiesSet方法，初始化shardInfo
        factory.afterPropertiesSet();

        return new StringRedisTemplate(factory);
    }
}
