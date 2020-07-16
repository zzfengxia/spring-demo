package com.zz.springboot.config;

import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-22 17:26
 * @desc 过滤器
 * ************************************
 */
@Configuration
public class FilterConfig {
    @Bean(name = "sitemesh3")
    WebSiteMeshFilter webSiteMeshFilter() {
        return new WebSiteMeshFilter();
    }
    /**
     * 注册sitemesh3拦截器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean<ConfigurableSiteMeshFilter> sitemeshFilter(@Qualifier("sitemesh3") WebSiteMeshFilter siteMeshFilter) {
        FilterRegistrationBean<ConfigurableSiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(siteMeshFilter);
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.addUrlPatterns("/*");
        // 指定sitemesh3装饰器文件
        //filterRegistrationBean.addInitParameter("configFile", "sitemesh3.xml");

        return filterRegistrationBean;
    }
}
