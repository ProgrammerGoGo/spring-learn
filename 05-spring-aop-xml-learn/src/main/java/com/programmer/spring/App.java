package com.programmer.spring;

import com.programmer.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author programmerGoGo
 * @Description
 */
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspects.xml");
        UserService bean = applicationContext.getBean(UserService.class);

        System.out.println("=========== doMethod1 ============");
        bean.doMethod1();
        System.out.println("=========== doMethod2 ============");
        bean.doMethod2();
        System.out.println("=========== doMethod3 ============");
        bean.doMethod3();
    }
}
