package com.alice.designpattern;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.alice.designpattern.demo.dao")
public class DesignpatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternApplication.class, args);
    }

}
