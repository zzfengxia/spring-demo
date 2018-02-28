package com.zz.springdemo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/2/26.
 * 描述：
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-annotation.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/zz/springDemo/annotation/spring-annotation.xml"));

        AnnotationDemo anno = (AnnotationDemo) beanFactory.getBean("annotation");
        anno.showOut();
    }
}
