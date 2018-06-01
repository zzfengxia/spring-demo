package com.zz.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-06-01 17:43
 * @desc 自定义URL匹配规则
 * --------------------------------
 */
@Configuration
public class CustomizeUrlMatcher extends WebMvcConfigurationSupport {

    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        // setUseSuffixPatternMatch设置是否是后缀模式匹配，如url:index.html是否能匹配到index请求，默认true
        // setUseTrailingSlashMatch设置是否自动后缀路径模式匹配，如url:/index/是否匹配到/index，默认真即匹配；
        configurer.setUseSuffixPatternMatch(false)
                .setUseTrailingSlashMatch(true);
    }
}
