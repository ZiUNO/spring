package com.ziuno.Configs;

import com.ziuno.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    //    @Configuration + @Bean 同时使用代替Beans.xml实现配置
//    默认单实例，通过改写scope可更改为多实例
//    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Hello casualName() {
        return new Hello();
    }

//    @Bean
//    public Aloha casualAlohaName() {
//        return new Aloha();
//    }

}
