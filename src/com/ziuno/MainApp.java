package com.ziuno;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//        Hello hello = (Hello)applicationContext.getBean("hello");
//        hello.getMessage();
//        ApplicationContext context = new FileSystemXmlApplicationContext(System.getProperty("user.dir") + "/src/Beans.xml");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Hello obj = (Hello) context.getBean("hello");
        obj.getMessage();
        obj.setMessage("obj");
        obj.getMessage();
//        Hello obj2 = (Hello) context.getBean("hello");
//        obj2.getMessage();
//        obj.getMessage();
        Aloha child = (Aloha)context.getBean("aloha");
        child.getMessage();
        child.getOwnMessage();

//        context.registerShutdownHook();
////        关闭hook，仅对singleton和默认有效，对prototype无效
        

    }
}
