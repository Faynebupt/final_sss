package com.lll.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.lll.entity.User;

import java.util.List;

/**
 * Created by qaa on 2017/7/11.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);//select * from user where name = #name
    User findByNameAndAge(String name, Integer age);
    User getByAge(Integer age);




//    @Modifying
    @Query(value = "select user from User user where user.name=?1")
    List<User> findByNameMatch(String name);


}