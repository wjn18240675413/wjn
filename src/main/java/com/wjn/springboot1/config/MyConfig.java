package com.wjn.springboot1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration//自定义配置类
public class MyConfig {

    //配置自己的bean
    @Bean  //纳入到spring容器
    public Date getdate(){
        return new Date();
    }

}
