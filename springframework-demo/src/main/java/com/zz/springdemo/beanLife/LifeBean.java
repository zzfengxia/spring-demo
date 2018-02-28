package com.zz.springdemo.beanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Francis.zz on 2016/2/24.
 * 描述：熟悉Bean的声明周期
 */
public class LifeBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public LifeBean() {
        System.out.println("1:constructor is invoked, Bean 被实例化!");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2:set 方法 invoking...");
        this.name = name;
    }

    public void sayHello() {
        System.out.println("10:sayHello is invoked, hello " + this.name);
    }

    // bean生命周期：3.实现BeanNameAware接口,注入bean的ID名
    @Override
    public void setBeanName(String beanName) {
        System.out.println("3:setBeanName is invoking,bean 名字：" + beanName);
    }

    // bean生命周期：4.实现BeanFactoryAware接口，注入beanFactory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4: setBeanFactory is invoked, " + beanFactory);
    }

    // bean生命周期：5.实现ApplicationContextAware接口，注入ApplicationContext
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5：setApplicationContext is invoked, " + applicationContext);
    }
    // bean生命周期：7.实现InitializingBean接口, 调用afterPropertiesSet方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7: afterPropertiesSet is invoking");
    }

    // bean生命周期：8.自定义初始化方法
    public void init() {
        System.out.println("8: init 方法被调用。");
    }

    // 11.关闭容器
    // bean生命周期：12.实现DisposableBean接口，调用destroy方法
    @Override
    public void destroy() throws Exception {
        System.out.println("12:destroy is invoking");
    }

    // bean生命周期：13.定制destroy方法
    public void myDestory() {
        System.out.println("13:myDestory is invoking... ");
    }
}
