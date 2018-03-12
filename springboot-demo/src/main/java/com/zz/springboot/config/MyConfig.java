package com.zz.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Francis.zz on 2018/3/9.
 * 配置文件属性绑定
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyConfig {
    // 配置文件中属性
    private List<String> argList;
    private String secret;
    // 松散绑定
    private String firstName;

    public List<String> getArgList() {
        return argList;
    }

    public void setArgList(List<String> argList) {
        this.argList = argList;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
