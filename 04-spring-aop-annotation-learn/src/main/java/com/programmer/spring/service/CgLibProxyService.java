package com.programmer.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Author programmerGoGo
 * @Description 没有实现接口，使用CGLib动态代理实现aop功能
 */
@Service
public class CgLibProxyService {

    public void doMethod1(String param) {
        System.out.println("CgLibProxyService#doMethod1 param:" + param);
    }

    public String doMethod2(String param) {
        System.out.println("CgLibProxyService#doMethod2 param:" + param);
        return param;
    }

    public String doMethod3Exception(String param) {
        System.out.println("CgLibProxyService#doMethod3Exception param:" + param);
        throw new RuntimeException("异常了");
    }
}
