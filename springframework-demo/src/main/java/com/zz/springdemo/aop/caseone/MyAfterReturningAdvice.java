package com.zz.springdemo.aop.caseone;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Francis.zz on 2016/3/10.
 * 描述：后置通知
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    /**
     * 被代理对象的方法调用完成后执行该方法
     * @param returnValue 方法返回值
     * @param method 方法名
     * @param args 方法的参数
     * @param target 目标对象(被代理对象)
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置通知：" + target.getClass().getSimpleName() + "."
                + method.getName() + "：销毁资源。");
    }
}
