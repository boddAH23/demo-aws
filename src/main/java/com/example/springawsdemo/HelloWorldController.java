package com.example.springawsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("")
    public String helloWorld() {
        System.out.println("Hello World2");
        return "Hello World2";
    }
}
