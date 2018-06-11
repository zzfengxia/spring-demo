package com.zz.springboot.repository;

import com.zz.springboot.domain.hq.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Francis.zz on 2018/3/13.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
