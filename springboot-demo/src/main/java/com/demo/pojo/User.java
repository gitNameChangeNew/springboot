package com.demo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @ClassName: User
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 16:42
 * @Version 1.0
 **/
@Data
@Table(name="user")
public class User {

    //id
    @Id
    @KeySql(useGeneratedKeys = true)   //主键自增
    private Long id;

    //用户名
    private String username;

    //生日
    private Date birthday;

    //性别
    private String sex;

    //地址
    private String address;
}
