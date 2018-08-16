package com.ziuno;

public class Hello {
    /*
    无init函数则可实现InitializingBean接口完成初始化回调
    无destroy函数则可实现DisposableBean接口完成销毁回调
    不建议
    */
    public String getMessage() {
        System.out.println("Message:" + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        message ="init message";
//    }
//
    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
