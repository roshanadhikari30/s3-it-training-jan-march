package com.example.demo.api.pojo;

public class POJOMain {

    public static void main(String[] args) {
        POJO pojo = new POJO();
        pojo.setX("20");
        System.out.println(pojo.getX());
        System.out.println(pojo.x);

        /*
        why do we need pojo class
        readability
        reusability

         */

    }
}
