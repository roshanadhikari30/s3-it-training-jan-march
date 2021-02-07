package com.example.demo.api.oop2;

import com.example.demo.api.oop.Parent;

/*
If you are sub class and even if you are on a different package you can still access it
if you are not sub class and if you are on a diff pa..
if you are not a sub class and if you are on the same package  -> yes
if you are not a sub class and if you are not on the same package -> No
 */
public class OOP2 extends Parent {

    public static void main(String[] args) {
        OOP2 oop2 = new OOP2();
        oop2.getDocuments();


    }
}
