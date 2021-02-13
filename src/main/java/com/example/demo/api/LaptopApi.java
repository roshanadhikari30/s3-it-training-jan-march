package com.example.demo.api;


import com.example.demo.model.Laptop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopApi {

    @PostMapping("/getLaptopDetails")

    public Laptop getLaptopDetails(@RequestBody Laptop laptop) {
        if (laptop.getName().equals("mac"))
        {

            laptop.setPrice("1800");
        }

            return laptop;


    }


}

