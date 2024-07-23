package com.example.moon.interceptor;

import jakarta.persistence.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private  SessionInterceptor sessionInterceptor;
    @Autowired
    private  AccessInterceptor accessInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**").excludePathPatterns("/callback","/css/**","/js/**","/fonts/**");
        registry.addInterceptor(accessInterceptor).addPathPatterns("/**").excludePathPatterns("/","/callback","/css/**","/js/**","/fonts/**");
    }

}