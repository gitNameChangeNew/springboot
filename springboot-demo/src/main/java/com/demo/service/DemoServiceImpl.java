package com.demo.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoServiceImpl
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 17:53
 * @Version 1.0
 **/
@Service
public class DemoServiceImpl  implements DemoService{

    @Override
    public String testService() {
        return "success";
    }
}
