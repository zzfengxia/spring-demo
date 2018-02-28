package com.zz.springdemo.aop.caseone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/3/8.
 * 描述：
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-aop.xml");

        TestService t = (TestService) app.getBean("proxyFactoryBean");
        TestService2 t2 = (TestService2) app.getBean("proxyFactoryBean");
        System.out.println("t2的类型：" + t2);
        System.out.println("---------------------------------------");
        t.sayHello();
        t2.sayHi();
    }
}
