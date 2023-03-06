package com.programmer.spring.service.impl;

import com.programmer.spring.dao.UserDao;
import com.programmer.spring.service.UserService;
import com.programmer.spring.model.User;

import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {

    }

    @Override
    public List<User> getAllUser() {
        System.out.println("UserServiceImpl#getAllUser");
        return userDao.getAllUser();
    }
}
