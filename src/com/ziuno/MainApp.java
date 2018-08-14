package com.ziuno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Hello hello = (Hello)applicationContext.getBean("hello");
        hello.getMessage();
    }
}
