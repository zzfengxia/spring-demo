package com.zz.springdemo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：spring练习相关的工具类
 */
public class SpringUtil2 {
    private static ApplicationContext app;

    private SpringUtil2() {

    }

    public static ApplicationContext getApplicationContext() {
        if(app == null) {
            synchronized (SpringUtil2.class) {
                if(app == null) {
                    app = new ClassPathXmlApplicationContext("applicationContext.xml");
                }
            }
        }
        return app;
    }
}
