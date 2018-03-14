package com.zz.springboot.domain;

import com.zz.springboot.annotation.Cacheable;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tm_user")
@Data
@Cacheable
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String warehouses;
    private String status;
    private String phone;
    private String homePage;
    private String jobnumber;
    private Long groupId;
}
