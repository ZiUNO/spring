package com.ziuno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//        Hello hello = (Hello)applicationContext.getBean("hello");
//        hello.getMessage();
        ApplicationContext context = new FileSystemXmlApplicationContext(System.getProperty("user.dir") + "/src/Beans.xml");
        Hello obj = (Hello)context.getBean("hello");
        obj.getMessage();
    }
}
