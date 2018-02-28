package com.zz.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：
 */
public class MainTest {
    public static void main(String[] args) {
        // 1)使用ApplicationContext获取Bean
        //ApplicationContext app = SpringUtil2.getApplicationContext();

        // 2)使用BeanFactory获取Bean
        BeanFactory app = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Cat cat = (Cat) app.getBean("cat");
        cat.perform();

        ApplicationContext appContext1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat1 = (Cat) appContext1.getBean("cat");
        Cat cat2 = (Cat) appContext1.getBean("cat");

        System.out.println(cat1 + " " + cat2);
        //ApplicationContext appContext2 = new FileSystemXmlApplicationContext("D:\\workspace\\headfirst\\src\\applicationContext.xml");
    }

}
