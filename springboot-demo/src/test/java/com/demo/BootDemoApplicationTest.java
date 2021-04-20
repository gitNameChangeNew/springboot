package com.demo;

import com.demo.mapper.UserMapper;
import com.demo.service.DemoService;
import com.demo.service.DemoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: BootDemoApplicationTest
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 17:50
 * @Version 1.0
 **/

@SpringBootTest
public class BootDemoApplicationTest {

    @Autowired
    DemoService demoService;

    @Autowired
    UserMapper userMapper;


    @Test
    public void contextLoads(){
        System.out.println(demoService.testService());
        System.out.println(userMapper.selectByPrimaryKey(1));
    }


}
