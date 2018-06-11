package com.zz.springboot.domain.mybatis;

import com.zz.springboot.domain.LongID;
import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
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
}
