package com.Eureka.FirstServer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/homeServer")
    public String home(){
        return "<h1> This is home page for server first </h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1> This is user page for server first </h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1> This is admin page for server first </h1>";
    }
}
