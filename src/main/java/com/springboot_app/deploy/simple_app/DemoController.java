package com.springboot_app.deploy.simple_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "Demo Application for CI/CD Pipeline";
    }
}
