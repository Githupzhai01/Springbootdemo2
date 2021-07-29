package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class Springbootdemo2Application {

    public static void main(String[] args) {
//        SpringApplication.run(Springbootdemo2Application.class, args);
        SpringApplication springApplication = new SpringApplication(Springbootdemo2Application .class);
        springApplication.addListeners(new ApplicationStartup());
        springApplication.run(args);
    }

}
