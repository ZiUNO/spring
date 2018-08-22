package com.ziuno.Configs;

import com.ziuno.Aloha;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HelloConfig.class)
public class AlohaConfig {
//    @Import(.class) 可引入其他配置类
    @Bean
    public Aloha alohaCasualName(){
        return new Aloha();
    }
}
