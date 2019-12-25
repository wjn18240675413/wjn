package com.wjn.springboot1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Springboot1ApplicationTests {

    @Autowired
    Date myDate;

    @Test
    public void test(){
        System.out.println(myDate);
    }
}
