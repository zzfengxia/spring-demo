package com.zz.springboot.listener;

import com.zz.springboot.domain.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 自定义Application事件，使用Application提供的事件发布、监听机制实现事件的发布、订阅功能
 * --------------------------------
 * create by Intellij IDEA.
 *
 * @author Francis.zz
 * @date 2018-03-14 15:42
 * --------------------------------
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {
    private User user;

    public UserRegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
}
