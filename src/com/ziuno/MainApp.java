package com.ziuno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Aloha aloha = (Aloha)applicationContext.getBean("aloha");
        aloha.printAloha();
        aloha.getMessage();
//        Hello hello = (Hello)applicationContext.getBean("hello");
//        hello.getMessage();
//        ApplicationContext context = new FileSystemXmlApplicationContext(System.getProperty("user.dir") + "/src/Beans.xml");


//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//        Hello obj = (Hello) context.getBean("hello");
//        obj.getMessage();
//        obj.setMessage("obj");
//        obj.getMessage();
////        Hello obj2 = (Hello) context.getBean("hello");
////        obj2.getMessage();
////        obj.getMessage();
//        Aloha child = (Aloha)context.getBean("aloha");
//        child.getMessage();
//        child.getOwnMessage();

//        context.registerShutdownHook();
////        关闭hook，仅对singleton和默认有效，对prototype无效
        

    }
}
