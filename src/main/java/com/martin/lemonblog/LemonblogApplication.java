package com.martin.lemonblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.martin.lemonblog.dao")
public class LemonblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemonblogApplication.class, args);
    }

}
