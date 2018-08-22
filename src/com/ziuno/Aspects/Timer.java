package com.ziuno.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Timer {
    @Pointcut("execution(* com.ziuno.Hello.get*())")
    private void timePointCut(){}

    @Before("timePointCut()")
    public void getBeforeTime(){
        System.out.println(System.currentTimeMillis());
    }
    @After("timePointCut()")
    public void getAfterTime(){
        System.out.println(System.currentTimeMillis());
    }
}
