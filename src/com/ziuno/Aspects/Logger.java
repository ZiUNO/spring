package com.ziuno.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {

    @Pointcut("execution(* com.ziuno.Hello.get*(..))")
    private void logPointCut() {
    }


    @Before("logPointCut()")
    public void beforeAdvice() {
        System.out.println("登录");
    }

    @After("logPointCut()")
    public void afterAdvice() {
        System.out.println("自动退出");
    }
}
