package com.ziuno;

public class Aloha {
    //    DI 测试
    private Hello hello;

    public Aloha(Hello hello, String message) {
        System.out.println("Aloha constructor");
        this.hello = hello;
        this.message = message;
    }

    public void printAloha() {
        hello.getMessage();
    }
//

    public String getMessage() {
        System.out.println("Aloha Message: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getOwnMessage() {
        System.out.println("Aloha ownMessage: " + ownMessage);
        return ownMessage;
    }

    public void setOwnMessage(String ownMessage) {
        this.ownMessage = ownMessage;
    }

    private String ownMessage;

}
