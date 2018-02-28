package com.zz.springdemo.assemble.autoawire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/3/3.
 * 描述：
 */
public class AutoMain {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-autowire.xml");

        Master e = (Master) app.getBean("master");
        System.out.println(e.getName() + "养" + e.getDog().getName());
    }
}
