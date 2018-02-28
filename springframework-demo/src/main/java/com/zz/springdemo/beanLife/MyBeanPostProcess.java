package com.zz.springdemo.beanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Francis.zz on 2016/2/24.
 * 描述：自定义后置处理器，类似web项目中的filter，使用bean时会自动执行处理器的两个方法。
 */
public class MyBeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("6: BeanPostProcessor的before方法被调用：" + o + "  " + s);
        return o;
    }

    // 参数Object o 被实例化的类，s为bean的id/name
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("9: BeanPostProcessor的after方法被调用：" + o + "  " + s);
        return o;
    }
}
