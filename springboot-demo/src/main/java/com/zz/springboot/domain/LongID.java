package com.zz.springboot.domain;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 15:46
 * @desc Long类型的主键
 * ************************************
 */
public interface LongID extends BaseID<Long> {
    @Override
    Long getId();

    @Override
    void setId(Long aLong);
}
