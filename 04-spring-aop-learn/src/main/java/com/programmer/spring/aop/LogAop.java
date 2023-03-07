package com.programmer.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author programmerGoGo
 * @Description
 */
@Aspect
@EnableAspectJAutoProxy
@Component
public class LogAop {

    // 定义切点
    @Pointcut("execution(* com.programmer.spring.service.*.*(..))")
    public void pointCut() {
    }

    @After("pointCut()")
    public void after() {
        System.out.println("最终通知");
    }

    @Before("pointCut()")
    public void Before() {
        System.out.println("前置通知");
    }

    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void afterReturning(String result) {
        System.out.println("后置通知，返回值：" + result);
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "e")
    public void afterReturning(Exception e) {
        System.out.println("异常通知，异常：" + e.getMessage());
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知，开始");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("开始执行被代理的方法：" + methodSignature.getName());

        // 前置处理
        Object proceed = joinPoint.proceed(); // 执行被代理的方法
        System.out.println("被代理的方法执行后的返回值：" + proceed);
        // 后置处理/异常处理
        // 最终处理

        System.out.println("环绕通知，结束");
        return proceed;
    }
}
