package com.zz.springdemo.aop.caseone;

/**
 * Created by Francis.zz on 2016/3/7.
 * 描述：
 */
public class TestServiceImpl1 implements TestService, TestService2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("hi "+ this.name + " TestServiceImpl1.sayHello is invoked");
    }

    @Override
    public void sayHi() {
        System.out.println("hi "+ this.name + " TestServiceImpl1.sayHi is invoked");
        int i = 9/0;
    }

}
