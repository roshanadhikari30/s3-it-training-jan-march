package com.example.demo.api.oop;

public class Child extends Parent {
    int money = 5000;

   /* public void getDocuments() {
        System.out.println("I am the child. I am manipulating the documents. From child. I sold all the parents documents");
    }*/

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.money);
        System.out.println(child.realStateProperties);
        child.getDocuments();


    }

}
