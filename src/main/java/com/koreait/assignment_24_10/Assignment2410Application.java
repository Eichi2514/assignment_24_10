package com.koreait.assignment_24_10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.koreait.assignment_24_10.repository") // 매퍼 패키지 경로
public class Assignment2410Application {
    public static void main(String[] args) {
        SpringApplication.run(Assignment2410Application.class, args);
    }
}
