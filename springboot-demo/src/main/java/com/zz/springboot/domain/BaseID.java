package com.zz.springboot.domain;

import java.io.Serializable;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 15:41
 * @desc 主键超类
 * ************************************
 */
public interface BaseID<ID extends Serializable> extends Serializable {
    ID getId();

    void setId(ID id);
}
