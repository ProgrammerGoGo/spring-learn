package com.programmer.spring.dao;

import com.programmer.spring.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
public class UserDao {
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 11));
        return list;
    }
}
