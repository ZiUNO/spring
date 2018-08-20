package com.ziuno;

import org.springframework.beans.factory.annotation.Required;

public class Hello {

//    public List getList() {
//        System.out.println("Hello List: " + list);
//        return list;
//    }
//
//    public void setList(List list) {
//        this.list = list;
//    }
//
//    public Set getSet() {
//        System.out.println("Hello Set: " + set);
//        return set;
//    }
//
//    public void setSet(Set set) {
//        this.set = set;
//    }
//
//    public Map getMap() {
//        System.out.println("Hello Map: " + map);
//        return map;
//    }
//
//    public void setMap(Map map) {
//        this.map = map;
//    }
//
//    public Properties getProperties() {
//        System.out.println("Hello Property: " + properties);
//        return properties;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//
//    List list;
//    Set set;
//    Map map;
//    Properties properties;

//    public Hello() {
//        System.out.println("Hello constructor");
////        System.out.println("Hello Message: " + getMessage());
//    }
//
//    /*
//        无init函数则可实现InitializingBean接口完成初始化回调
//        无destroy函数则可实现DisposableBean接口完成销毁回调
//        不建议
//        */
    public String getMessage() {
        System.out.println("Hello Message: " + message);
        return message;
    }
    @Required
    public void setMessage(String message) {
        this.message = message;
    }


    private String message;
//
////    @Override
////    public void afterPropertiesSet() throws Exception {
////        message ="init message";
////    }
////
//    public void init(){
//        System.out.println("init");
//    }
//
//    public void destroy(){
//        System.out.println("destroy");
//    }
}
