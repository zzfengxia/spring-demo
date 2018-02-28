package com.zz.springdemo.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-beans.xml");
        ChangeLetter cat = (ChangeLetter) app.getBean("changeLetter");
        cat.change();

        /*BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-beans.xml"));
        beanFactory.getBean("changeLetter");
        beanFactory.getBean("changeLetter");*/
    }

}
