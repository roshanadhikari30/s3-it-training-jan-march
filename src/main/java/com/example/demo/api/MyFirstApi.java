package com.example.demo.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MyFirstApi {

    @GetMapping("/hi")
    public String hello() {
        return "Hi ! How are you?";
    }

    @GetMapping("/name")
    public String name() {
        return "David";
    }
}
