package com.zz.springboot.service;

import com.zz.springboot.domain.hq.User;
import com.zz.springboot.listener.UserRegisterEvent;
import com.zz.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
    private ApplicationContext applicationContext;

    public User findOne(Long id) {
        User result = userRepository.getOne(id);

        return result;
    }

    public void register(User user) {
        user.setCTime(new Date());
        // 自定义事件发布
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
