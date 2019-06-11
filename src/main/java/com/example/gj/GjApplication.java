package com.example.gj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@MapperScan("com.example.gj.mapper")
@SpringBootApplication
public class GjApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjApplication.class, args);
    }

}
