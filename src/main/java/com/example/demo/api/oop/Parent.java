package com.example.demo.api.oop;

public class Parent {


    String realStateProperties = "Property at 505 Hansley way, NY,NY";


    protected static void getDocuments() {
        System.out.println("Inheriting a list of related documents. From Parent.");
    }

    private void getPersonalInformation() {
        System.out.println("Here are all the personal information. From Parent");
    }

    public void getOtherInformation() {
        System.out.println("getting some common information.");
    }

}
