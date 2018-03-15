package com.zz.springboot.mapper;

import com.zz.springboot.domain.mybatis.User;

/**
 * springboot使用mybatis,mapper类可以添加@Mapper注解或者在入口使用@MapperScan扫描包
 * mybatis官方sample：https://github.com/mybatis/spring-boot-starter
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-14 17:42
 * --------------------------------
 */
public interface UserMapper {
    User findOne(Long id);
}
