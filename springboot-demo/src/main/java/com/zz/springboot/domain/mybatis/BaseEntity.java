package com.zz.springboot.domain.mybatis;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zz.springboot.domain.LongID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 16:37
 * @desc mybatis
 * ************************************
 */
public class BaseEntity implements LongID {
    /**
     * 主键：Long
     */
    Long id;
    /**
     * 创建时间
     */
    Date cTime;
    /**
     * 更新时间
     */
    Date mTime;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }
}
