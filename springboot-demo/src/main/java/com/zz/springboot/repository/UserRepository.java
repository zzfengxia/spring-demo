package com.zz.springboot.repository;

import com.zz.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Francis.zz on 2018/3/13.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
