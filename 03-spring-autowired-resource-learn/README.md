# Spring源码分析@Autowired、@Resource注解的区别
https://blog.csdn.net/qq_35634181/article/details/104802906

这里在总结一下@Autowired、@Resource注解的区别：

       @Autowired注解：

       1.Spring本身替换的注解（org.springframework.beans.factory.annotation.Autowired），需要导入Spring相应的jar包才能使用

       2.可以标注的位置：构造器、方法、方法参数、变量域和注解上面

       3.在Spring容器解析@Autowired注解时，使用的后置处理器为AutowiredAnnotationBeanPostProcessor

       4. @Autowired注解有一个required属性，当指定required属性为false时，意味着在容器中找相应类型的bean，如果找不到则忽略，而不报错（这一条是两个注解所没有的功能）

       5. 默认优先按照类型去容器中找对应的组件，找到就赋值，如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找，如果组件id对象的bean不存在，而且required属性为true，就报错

       6.如果标注了@Autowired的是static静态的属性或方法，那么Spring会直接忽略，但不会报错。

      

       @Resource注解：

         1.JSR250规范提供的注解（javax.annotation.Resource），不需要导入格外的包，这个注解在JDK的rt.jar包中

         2.可以标注的位置：TYPE(表示可以标注在接口、类、枚举)，FIELD(变量域)和METHOD(方法)上面。

         3.在Spring容器解析@Resource注解时，使用的后置处理器为CommonAnnotationBeanPostProcessor

         4. 默认是按照组件名称进行装配的，根据@Resource注解name属性的名称去容器中查找，如果name没有指定，则根据标注了@Resource的属性名称去判断容器中是否存在该名称的bean，如果不存在，则会走和@Autowired一样的逻辑，这个时候就会支持@Primary注解（有的博客说不支持，那么错误的，源码不会骗人）。

         5.如果标注了@Resource的是static静态的属性或方法，那么会直接报错

        6.标注了@Resource的是方法只能有一个参数，如果是没有或者是多个，那么Spring会直接报错，而@Autowired则没有限制。





