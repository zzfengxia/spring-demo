package com.zz.springboot.domain.mybatis;

import lombok.Data;

import java.util.Date;

/**
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-14 17:57
 * --------------------------------
 */
@Data
public class User {
    private Long id;
    private String username;
    private String realname;
    private String password;
    private String salt;
    private String email;
    private String jobuuid;
    private Long departmentId;
    private Date createTime;
    private Date updateTime;
    private Date lastTime;
    private String status;
    private String phone;
    private String homePage;
    private String jobnumber;
    private Long groupId;
}
