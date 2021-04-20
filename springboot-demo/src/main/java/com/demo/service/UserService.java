package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserService
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/20 10:29
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User queryUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
