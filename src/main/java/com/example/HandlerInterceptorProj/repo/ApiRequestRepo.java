package com.example.HandlerInterceptorProj.repo;

import com.example.HandlerInterceptorProj.model.ApiRequestInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRequestRepo extends JpaRepository<ApiRequestInfo, Long> {
}
