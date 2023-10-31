package com.example.HandlerInterceptorProj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/api/endpoint1")
    public String endpoint1() {
        return "This is endpoint 1.";
    }

    @GetMapping("/api/endpoint2")
    public String endpoint2() {
        return "This is endpoint 2.";
    }








//    @GetMapping("/sample")
//    public String sampleEndpoint() {
//        return "This is a sample response.";
//    }

}
