package com.programmer.spring.service.impl;

import com.programmer.spring.dao.UserDao;
import com.programmer.spring.model.User;
import com.programmer.spring.service.UserService;

import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
public class MyUserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public MyUserServiceImpl() {

    }

    @Override
    public List<User> getAllUser() {
        System.out.println("MyUserServiceImpl#getAllUser");
        return userDao.getAllUser();
    }
}
