package com.Eureka.FirstClientServer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AuthController {

    @Autowired
    public RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    static final String FIRST_SERVER_URL= "http://FirstServer/";

    @GetMapping("/homeClient")
    public String home() {
        return "<h1> This is home page for Client first </h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1> This is user page for Client first </h1>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1> This is admin page for Client first </h1>";
    }

    @GetMapping("/connectServer")
    public String firstServerConnect(){
        return restTemplate.getForObject(FIRST_SERVER_URL+"homeServer", String.class);
    }
}
