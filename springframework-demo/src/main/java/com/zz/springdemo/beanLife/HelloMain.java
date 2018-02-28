package com.zz.springdemo.beanLife;

import com.zz.springdemo.util.SpringUtil2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Francis.zz on 2016/2/24.
 * 描述：Bean的生命周期
 */
public class HelloMain {
    public static void main(String[] args) {
        // 使用ApplicationContext获取bean对象的生命周期
        // 生命周期：1. 实例化bean,默认调用无参构造函数
        ApplicationContext app = SpringUtil2.getApplicationContext();
        LifeBean lifeBean = (LifeBean) app.getBean("lifeBean");

        lifeBean.sayHello();

        // 通过beanFactory获取bean对象的生命周期
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        LifeBean life = (LifeBean) factory.getBean("lifeBean");
        life.sayHello();
    }

}
