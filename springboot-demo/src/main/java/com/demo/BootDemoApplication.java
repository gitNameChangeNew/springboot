package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: BootDemoApplication
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 11:31
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.demo.mapper")
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class,args);
    }
}
