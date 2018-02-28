package com.zz.springdemo.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Francis.zz on 2016/2/26.
 * 描述：
 */

public class AnnotationDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnnotationDemo() {
        System.out.println("Annotation 被实例化...");
    }

    // @PostConstruct 注解，指定方法为init-method

    @PostConstruct
    public void initMethod() {
        this.name = "注解init";
        System.out.println("initMethod is invoked...");
    }

    // @PreDestroy 注解，指定方法为destroy-method
    @PreDestroy
    public void onDestroy() {
        System.out.println("onDestroy is invoked...");
    }

    public void showOut() {
        System.out.println("输出：" + name);
    }
}
