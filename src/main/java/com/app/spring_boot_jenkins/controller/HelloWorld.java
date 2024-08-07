package com.app.spring_boot_jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloWorld {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello world spring boot integrated with CI/CD Jenkins pipeline !");
    }
}
