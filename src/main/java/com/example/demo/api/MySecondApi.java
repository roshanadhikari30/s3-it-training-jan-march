package com.example.demo.api;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondApi {

    @GetMapping("/reverse")
    public int reverse() {
        System.out.println(MDC.get("x"));
        int x = 1234;
        int reversed = 4321;
        return reversed;
    }
}
