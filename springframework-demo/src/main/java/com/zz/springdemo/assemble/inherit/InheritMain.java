package com.zz.springdemo.assemble.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/3/2.
 * 描述：
 */
public class InheritMain {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-inherit.xml");

        Student stu1 = (Student) app.getBean("student");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getDegree());
    }
}
