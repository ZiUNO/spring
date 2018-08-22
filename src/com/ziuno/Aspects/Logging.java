package com.ziuno.Aspects;

public class Logging {

    public void beforeAdvice(){
        System.out.println("登录");
    }

    public void afterAdvice(){
        System.out.println("自动退出");
    }
}
