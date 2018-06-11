package com.zz.springboot.domain;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-06-09 15:47
 * @desc StringID
 * ************************************
 */
public interface StringID extends BaseID<String> {
    @Override
    String getId();

    @Override
    void setId(String s);
}
