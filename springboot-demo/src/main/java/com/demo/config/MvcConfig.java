package com.demo.config;

import com.demo.interceptor.SysControllerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: MvcConfig 注册拦截器
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/19 17:22
 * @Version 1.0
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截任意路径
        registry.addInterceptor(new SysControllerInterceptor()).addPathPatterns("/**");
    }
}
