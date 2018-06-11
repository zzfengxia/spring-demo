package com.zz.springboot.listener;

import com.zz.springboot.domain.hq.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 对自定义事件的监听；可通过ApplicationListener接口或者使用@EventListener的Bean实现
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-14 15:46
 * --------------------------------
 */
@Component
public class UserRegisterListener /*implements ApplicationListener<UserRegisterEvent>*/ {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        User user = userRegisterEvent.getUser();

        // do something
        System.out.println("--" + userRegisterEvent.getSource().getClass());
        logger.info("用户:{},邮箱:{}已注册.", user.getUsername(), user.getEmail());
    }
}
