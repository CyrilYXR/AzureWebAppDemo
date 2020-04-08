package com.cyril.demo.azurewebappdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
