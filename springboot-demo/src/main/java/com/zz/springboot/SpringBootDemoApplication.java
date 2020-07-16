package com.zz.springboot;

import com.zz.springboot.annotation.IgnoreScan;
import com.zz.springboot.repository.BaseRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Francis.zz on 2018/3/9.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.zz.springboot.repository", repositoryBaseClass = BaseRepository.class)
@MapperScan(basePackages = "com.zz.springboot.mapper")
// 默认会扫描启动类同包以及子包下的注解，可以使用ComponentScan指定扫描的包或忽略某些类
@ComponentScan(excludeFilters = @ComponentScan.Filter(classes = IgnoreScan.class))
// spring boot 2开启缓存
@EnableCaching
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
