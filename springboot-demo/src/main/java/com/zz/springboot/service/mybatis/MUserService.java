package com.zz.springboot.service.mybatis;

import com.zz.springboot.domain.mybatis.User;
import com.zz.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * --------------------------------
 * create by Intellij IDEA.
 *
 * @author Francis.zz
 * @date 2018-03-15 09:29
 * --------------------------------
 */
@Service
public class MUserService {
    @Autowired
    private UserMapper userMapper;

    public User fingOne(Long id) {
        return userMapper.findOne(id);
    }
}
