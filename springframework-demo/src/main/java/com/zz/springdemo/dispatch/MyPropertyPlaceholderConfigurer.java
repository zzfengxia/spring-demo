package com.zz.springdemo.dispatch;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Francis.zz on 2016/3/5.
 * 描述：自定义属性读取类，继承自PropertyPlaceholderConfigurer，在spring配置文件中使用该类来获取配置文件的内容，
 * 在java中可以使用该类的静态方法getProperty获取配置的属性文件的内容
 */
public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    protected static Map properties;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        properties = new HashMap();
        Set<Entry<Object, Object>> propEntry = props.entrySet();

        for(Entry<Object, Object> e : propEntry) {
            properties.put(e.getKey().toString(), e.getValue().toString());
        }
    }

    public static String getProperty(String key) {
        if(properties != null) {
            return properties.get(key).toString();
        }

        return "";
    }
}
