package com.zz.springdemo.assemble.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/3/3.
 * 描述：
 */
public class conTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-construct.xml");

        Employee e = (Employee) app.getBean("employee");
        System.out.println(e.getId() + ":" +e.getName());
    }
}
