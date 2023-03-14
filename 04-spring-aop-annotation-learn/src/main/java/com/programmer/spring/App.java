package com.programmer.spring;

import com.programmer.spring.service.CgLibProxyService;
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
        CgLibProxyService bean = applicationContext.getBean(CgLibProxyService.class);
        System.out.println("======doMethod1======");
        bean.doMethod1("hello");
        System.out.println("======doMethod2======");
        bean.doMethod2("hello");
        System.out.println("======doMethod3Exception======");
        bean.doMethod3Exception("hello");
    }

}
