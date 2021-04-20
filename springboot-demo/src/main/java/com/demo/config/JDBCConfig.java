package com.demo.config;

//import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @ClassName: JDBCConfig
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 11:55
 * @Version 1.0
 **/
@Configuration
//@PropertySource(value = {"classpath:application.properties"})
//@EnableConfigurationProperties(JdbcProperties.class)
public class JDBCConfig {

  /*  @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/


/*    @Bean
    public DataSource getDataSource(JdbcProperties pro){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(pro.getDriverClassName());
        dataSource.setUrl(pro.getUrl());
        dataSource.setUsername(pro.getUsername());
        dataSource.setPassword(pro.getPassword());
        return dataSource;
    }*/


  /*  @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        return new DruidDataSource();
    }*/
}
