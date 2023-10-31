package com.example.HandlerInterceptorProj.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "api_request_info")
@Component
public class ApiRequestInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endpoint;
    private String method;
    private Date requestTime;

    private String responseTime;
    private int StatusCode;
    private String requestHeaderName;
    private String requestID;
    private String hostName;
    private String contentType;
    private String getContextPath;

}
