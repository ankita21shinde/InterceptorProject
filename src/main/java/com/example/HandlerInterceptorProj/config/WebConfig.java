package com.example.HandlerInterceptorProj.config;

import com.example.HandlerInterceptorProj.service.InterceptorTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
//to avoid null pointer exception
    @Bean
    public InterceptorTest interceptorTest(){
        return  new InterceptorTest();
    }

//    public APIRequestInterceptor apiRequestInterceptor() {
//        return new APIRequestInterceptor();
//    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorTest());
    }
}
