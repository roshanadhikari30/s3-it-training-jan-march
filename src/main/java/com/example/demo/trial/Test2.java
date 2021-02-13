package com.example.demo.trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

    @Autowired
    Test test;

    @GetMapping("/test")
    public String getInfo() {
       test.setName("ram");
       return test.name;

    }
}
