package com.paymentservice.paymentservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Class";
    }
}
