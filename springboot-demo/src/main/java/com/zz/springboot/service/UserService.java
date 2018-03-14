package com.zz.springboot.service;

import com.zz.springboot.domain.User;
import com.zz.springboot.listener.UserRegisterEvent;
import com.zz.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Francis.zz on 2018/3/13.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    ApplicationContext applicationContext;

    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    public void register(User user) {
        user.setCreateTime(new Date());

        // 自定义事件发布
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
