package com.ziuno.Events;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My Event";
    }
}
