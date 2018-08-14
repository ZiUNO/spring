package com.ziuno;

public class Hello {
    public String getMessage() {
        System.out.println("Message:" + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
