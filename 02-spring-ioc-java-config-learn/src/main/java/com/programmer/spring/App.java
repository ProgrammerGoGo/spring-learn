package com.programmer.spring;

import com.programmer.spring.config.BeanConfig;
import com.programmer.spring.service.UserService;
import com.programmer.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        // 通过类型获取实例，如果同一类型有多个实例会报错
//        UserService userService = applicationContext.getBean(UserService.class);

        // 通过id（xml配置的bean id）获取实例
//        UserService userService = (UserService) applicationContext.getBean("myUserService");

        // 通过类型和id（xml配置的bean id）获取实例
        UserService userService = applicationContext.getBean("myUserService", UserService.class);
        List<User> list = userService.getAllUser();

        System.out.println(list);
    }
}
