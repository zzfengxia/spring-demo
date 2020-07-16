package com.zz.springboot.domain.mybatis;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-14 17:57
 * --------------------------------
 */
@Setter
@Getter
@ToString
public class User extends BaseEntity {
    private String username;
    private String realname;
    private String password;
    private String salt;
    private String email;
    private String jobuuid;
    private Long departmentId;
    private Date lastTime;
    private String status;
    private String phone;
    private String homePage;
    private String jobnumber;
    private Long groupId;
}
