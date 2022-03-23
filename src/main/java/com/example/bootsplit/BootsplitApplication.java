package com.example.bootsplit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.example.bootsplit.mapper")
public class BootsplitApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootsplitApplication.class, args);
    }

}
