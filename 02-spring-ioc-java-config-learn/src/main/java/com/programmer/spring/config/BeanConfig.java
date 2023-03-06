package com.programmer.spring.config;

import com.programmer.spring.aop.LogAop;
import com.programmer.spring.dao.UserDao;
import com.programmer.spring.model.User;
import com.programmer.spring.service.UserService;
import com.programmer.spring.service.impl.MyUserServiceImpl;
import com.programmer.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author programmerGoGo
 * @Description
 */
@EnableAspectJAutoProxy
@Configuration
public class BeanConfig {

    @Bean("userService")
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean()
//    @Bean("myUserService")
    public MyUserServiceImpl myUserService() {
        MyUserServiceImpl userService = new MyUserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean("userDao")
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        return userDao;
    }

    @Bean("logAop")
    public LogAop logAop() {
        LogAop logAop = new LogAop();
        return logAop;
    }
}
