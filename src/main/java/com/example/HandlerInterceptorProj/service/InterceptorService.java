package com.example.HandlerInterceptorProj.service;

import com.example.HandlerInterceptorProj.model.ApiRequestInfo;

public interface InterceptorService {
    public ApiRequestInfo saveEntity(ApiRequestInfo apiRequestInfo);
}
