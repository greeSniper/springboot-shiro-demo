package com.tangzhe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 唐哲
 * 2018-01-30 16:33
 */
@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.tangzhe.shiro.mapper"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
