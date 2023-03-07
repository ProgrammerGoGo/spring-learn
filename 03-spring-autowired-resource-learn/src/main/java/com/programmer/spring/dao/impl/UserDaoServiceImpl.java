package com.programmer.spring.dao.impl;

import com.programmer.spring.dao.UserDaoService;
import org.springframework.stereotype.Repository;

/**
 * @Author programmerGoGo
 * @Description
 */
@Repository
public class UserDaoServiceImpl implements UserDaoService {
    @Override
    public void getUser() {
        System.out.println("UserDaoServiceImpl#getUser");
    }
}
