package com.zz.springdemo.aop.caseone;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Francis.zz on 2016/3/7.
 * 描述：前置通知
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param method 被调用方法的名字
     * @param args 给method传递的参数
     * @param target
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("***********************************");
        System.out.println("前置通知：" + target.getClass().getSimpleName() +
                "." + method.getName() + " will be invoking");
    }
}
