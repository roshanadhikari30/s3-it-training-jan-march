package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondApi {

    @Autowired //will create an object, internally calls the new keyword
    LaptopServiceProvider laptopServiceProvider;


    @Value("$name")
    String name;

    @GetMapping
    public int getPrice() {
        return laptopServiceProvider.laptopPrice;
    }

    @GetMapping("mySecondApi")
    public int getPriceForAnotherLaptio() {
        return laptopServiceProvider.getLaptopPriceSecond;
    }

    public void getName(){
        System.out.println(name);
    }
}

