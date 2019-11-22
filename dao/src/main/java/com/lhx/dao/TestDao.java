package com.lhx.dao;

import com.lhx.model.User;
import org.springframework.stereotype.Component;

/**
 * @Name com.lhx.dao.TestDao
 * @Description * @Author lhx
 * @Version 2019/11/23 0:57
 */
@Component("testDao")
public class TestDao {
    public User getUser(){
        User user = new User();
        user.setName("holler world!");
        return user;
    }
}
