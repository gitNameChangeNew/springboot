package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @ClassName: DemoController
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 11:32
 * @Version 1.0
 **/
@RestController
public class DemoController {


    /*@Autowired
    private DataSource dataSource;*/

    @GetMapping(value = "testController")
    public String testController(){
        return "demo success";
    }
}
