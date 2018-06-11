package com.zz.springboot.domain.hq;

import com.zz.springboot.annotation.Cacheable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tm_user")
@Setter
@Getter
@Cacheable
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
