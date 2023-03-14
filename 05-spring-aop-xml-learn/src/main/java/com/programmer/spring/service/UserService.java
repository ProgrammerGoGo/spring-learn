package com.programmer.spring.service;

/**
 * @Author programmerGoGo
 * @Description
 */
public class UserService {

    public void doMethod1() {
        System.out.println("UserService.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("UserService.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("UserService.doMethod3()");
        throw new Exception("some exception");
    }
}
