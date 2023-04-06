package com.programmer.spring;

import com.programmer.spring.config.AppConfig;
import com.programmer.spring.service.CgLibProxyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author programmerGoGo
 * @Description
 */
//@ComponentScan("com.programmer.spring")
public class App {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CgLibProxyService bean = applicationContext.getBean(CgLibProxyService.class);
        System.out.println("======doMethod1======");
        bean.doMethod1("hello");
        System.out.println("======doMethod2======");
        bean.doMethod2("hello");
        System.out.println("======doMethod3Exception======");
        try {
            bean.doMethod3Exception("hello");
        } catch (Exception e) {
            System.out.println("doMethod3Exception error." + e.getMessage());
        }

        System.out.println("======doMethod4WithLogAnnotation======");
        bean.doMethod4WithLogAnnotation("hello");
    }

}
