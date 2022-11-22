package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKubernetes {

    @GetMapping("/hello-k8s")
    public String helloK8s() {
        return "Hello! Spring Boot with Kubernetes";
    }
}
