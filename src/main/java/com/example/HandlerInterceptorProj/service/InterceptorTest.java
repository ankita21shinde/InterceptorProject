package com.example.HandlerInterceptorProj.service;

import com.example.HandlerInterceptorProj.model.ApiRequestInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class InterceptorTest implements HandlerInterceptor {

    @Autowired
    private InterceptorService interceptorService;



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        ApiRequestInfo apiRequestInfo=new ApiRequestInfo();
        apiRequestInfo.setEndpoint(request.getRequestURI());
        apiRequestInfo.setGetContextPath(request.getContextPath());

        interceptorService.saveEntity(apiRequestInfo);
        return true;


    }



    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        Date responseTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ApiRequestInfo apiRequestInfo=new ApiRequestInfo();
        apiRequestInfo.setEndpoint(request.getRequestURI());
        apiRequestInfo.setMethod(request.getMethod());
        apiRequestInfo.setRequestTime(new Date());
        apiRequestInfo.setStatusCode(response.getStatus());
        apiRequestInfo.setRequestHeaderName(request.getHeaderNames().toString());
        apiRequestInfo.setRequestID(request.getRequestId());
        apiRequestInfo.setHostName(request.getServerName());
       apiRequestInfo.setContentType(request.getContentType());



        System.out.println("Response Time: " + dateFormat.format(responseTime));
        apiRequestInfo.setResponseTime(dateFormat.format(responseTime));

        interceptorService.saveEntity(apiRequestInfo);
    }
}
