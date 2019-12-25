package com.wjn.springboot1.web;


import com.wjn.springboot1.entity.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*@RequestMapping("/")
    public String test(){
        if(true){
            throw new RuntimeException("异常测试");
        }
        return "index";
    }*/

    @RequestMapping("/")
    public String test(){
        if(true){
            throw new BusinessException("500","自定义异常500");
        }
        return "index";
    }
}
