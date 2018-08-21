package com.ziuno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AlohaConfig.class);
        Hello hello = context.getBean(Hello.class);
        Hello hello1 = context.getBean(Hello.class);
        hello.setMessage("set casual message");
        hello.getMessage();
        hello1.getMessage();
        Aloha aloha = context.getBean(Aloha.class);
        aloha.setOwnMessage("set aloha message casually");
        aloha.getOwnMessage();
        ((AnnotationConfigApplicationContext) context).registerShutdownHook();

//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        Hello hello = (Hello)context.getBean("hello");
//        hello.getMessage();
//
//        Aloha aloha = (Aloha) context.getBean("aloha");
//        aloha.printHello();
//        aloha.getOwnMessage();
//        aloha.getMessage();


//        Hello hello = (Hello) context.getBean("hello");
//        hello.getList();
//        hello.getMap();
//        hello.getProperties();
//        hello.getSet();

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//        Aloha aloha = (Aloha)applicationContext.getBean("aloha");
//        aloha.printAloha();
//        aloha.getMessage();
//        aloha.getOwnMessage();
//        Hello hello = (Hello)context.getBean("hello");
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
//        关闭hook，仅对singleton和默认有效，对prototype无效


    }
}
