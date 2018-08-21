package com.ziuno;

public class Aloha {
    //    DI 测试

//    private Hello hello;
//    @Autowired
//    @Qualifier("more_casual_name")
//    private Hello hello;


//    @Autowired
//    public Aloha(Hello h, String m, String om) {
//        System.out.println("Aloha constructor");
//        this.hello = h;
//        this.message = m;
//        this.ownMessage = om;
//    }

//    public void printHello() {
//        hello.getMessage();
//    }
//

//    public String getMessage() {
//        System.out.println("Aloha Message: " + message);
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    private String message;

    public String getOwnMessage() {
        System.out.println("Aloha ownMessage: " + ownMessage);
        return ownMessage;
    }

    public void setOwnMessage(String ownMessage) {
        this.ownMessage = ownMessage;
    }

    private String ownMessage;

//    @Resource(name = "more_casual_name")
//    public void setHello(Hello hello) {
//        this.hello = hello;
//    }
}
