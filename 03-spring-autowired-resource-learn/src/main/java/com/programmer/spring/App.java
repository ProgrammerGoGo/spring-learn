package com.programmer.spring;

import com.programmer.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author programmerGoGo
 * @Description
 */
@ComponentScan("com.programmer.spring")
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.getUser();
    }
}
