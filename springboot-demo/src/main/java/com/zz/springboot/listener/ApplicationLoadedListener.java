package com.zz.springboot.listener;

import com.zz.springboot.repository.BaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * --------------------------------
 * create by Intellij IDEA.
 *
 * @author Francis.zz
 * @date 2018-03-14 11:41
 * --------------------------------
 */
@Component
public class ApplicationLoadedListener implements ApplicationListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 由于项目启动时会多次执行该方法，故过滤掉其他情况，只执行一次
        if(event.getSource() instanceof SpringApplication) {
            // spring content加载后，将redis bean注入到repository基类中
            BaseRepository.setRedisTemplate(redisTemplate);
            logger.info("----------> repository基类注入redis bean");
        }
    }
}
