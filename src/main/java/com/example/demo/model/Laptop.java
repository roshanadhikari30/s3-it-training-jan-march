package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter

public class Laptop {

    private String name;
    private String model;
    private String year;
    private String price;
    private String serialNumber;
    private String ramSize;
}
