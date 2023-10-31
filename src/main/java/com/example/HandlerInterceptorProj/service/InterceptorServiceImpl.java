package com.example.HandlerInterceptorProj.service;

import com.example.HandlerInterceptorProj.model.ApiRequestInfo;
import com.example.HandlerInterceptorProj.repo.ApiRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterceptorServiceImpl implements InterceptorService{
    @Autowired
    private ApiRequestRepo apiRequestRepo;

    @Override
    public ApiRequestInfo saveEntity(ApiRequestInfo apiRequestInfo) {
        return apiRequestRepo.save(apiRequestInfo);
    }
}
