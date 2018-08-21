package com.ziuno.Listeners;

import com.ziuno.Events.MyEvent;
import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("Listen: " + myEvent.toString());
    }
}
