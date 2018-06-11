package com.zz.springboot.domain.hq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zz.springboot.domain.LongID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 16:22
 * @desc jpa hibernate, 使用{@link MappedSuperclass}注解将字段注入到子类
 * ************************************
 */
@Setter
@Getter
@MappedSuperclass
// 解决错误`No serializer found for class org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer`
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BaseEntity implements LongID {
    /**
     * 主键：Long
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间
     */
    private Date cTime;
    /**
     * 更新时间
     */
    private Date mTime;

    @PrePersist
    public void prePersist() {
        if (cTime == null) {
            cTime = new Date();
        }
        mTime = cTime;
    }

    @PreUpdate
    public void preUpdate() {
        mTime = new Date();
    }
}
