package com.programmer.spring.service.impl;

import com.programmer.spring.dao.UserDaoService;
import com.programmer.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author programmerGoGo
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    // 默认按类型注入，如果同类型有多个实例会报错
//    @Autowired
//    private UserDaoService userDaoService;

    // @Qualifier指定名称后，会在IOC容器中查找相同名称的实例注入
    @Autowired
    @Qualifier("userDaoServiceImpl")
    private UserDaoService userDaoService1;

    @Autowired
    @Qualifier("myUserDaoServiceImpl")
    private UserDaoService userDaoService2;

    // @Resource默认按名称注入，
    @Resource(name = "userDaoServiceImpl")
    private UserDaoService userDaoService3;

    @Resource(name = "myUserDaoServiceImpl")
    private UserDaoService userDaoService4;

    // @Resource未设置名称，会按注入的属性名在IOC容器中查找同名实例并注入，此处查找名为 userDaoServiceImpl 的实例
    @Resource
    private UserDaoService userDaoServiceImpl;

    @Resource
    private UserDaoService myUserDaoServiceImpl;

    // @Resource未设置名称，且属性名 userDaoService 的同名实例不存在，@Resource会走和@Autowired同样的逻辑，此处报错，因为同类型的实例有多个
//    @Resource
//    private UserDaoService userDaoService;

    @Resource
    @Qualifier("myUserDaoServiceImpl")
    private UserDaoService userDaoService;

    @Override
    public void getUser() {
        System.out.println("@Qualifier(\"userDaoServiceImpl\") 注入：");
        userDaoService1.getUser();

        System.out.println();

        System.out.println("@Qualifier(\"myUserDaoServiceImpl\") 注入：");
        userDaoService2.getUser();

        System.out.println();

        System.out.println("@Resource(name = \"userDaoServiceImpl\") 注入：");
        userDaoService3.getUser();

        System.out.println();

        System.out.println("@Resource(name = \"myUserDaoServiceImpl\") 注入：");
        userDaoService4.getUser();

        System.out.println();

        System.out.println("@Resource + 属性名 userDaoServiceImpl 注入：");
        userDaoServiceImpl.getUser();

        System.out.println();

        System.out.println("@Resource + 属性名 myUserDaoServiceImpl 注入：");
        myUserDaoServiceImpl.getUser();

        System.out.println();

        System.out.println("@Resource + @Qualifier(\"myUserDaoServiceImpl\") 注入：");
        userDaoService.getUser();
    }
}
