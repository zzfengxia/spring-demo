package com.zz.springboot;

import com.zz.springboot.repository.BaseRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Francis.zz on 2018/3/9.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.zz.springboot.repository", repositoryBaseClass = BaseRepository.class)
@MapperScan(basePackages = "com.zz.springboot.mapper")
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
