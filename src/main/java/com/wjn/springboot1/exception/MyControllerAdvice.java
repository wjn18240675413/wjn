package com.wjn.springboot1.exception;


import com.wjn.springboot1.entity.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyControllerAdvice {
    /*@ExceptionHandler(value=Exception.class)
    public Map<String,Object> erroHandler(Exception e){
        Map<String,Object> map=new HashMap<>();
        map.put("code", -1);
        map.put("msg", e.getMessage());
        return map;
    }*/

    @ExceptionHandler(value= BusinessException.class)
    public Map<String,Object> errorHandler(BusinessException e){
        Map<String,Object> map=new HashMap<>();
        map.put("code", e.getCode());
        map.put("msg", e.getMsg());
        return map;
    }

}
