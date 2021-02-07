package com.example.demo.api.abstraction;

abstract class Car {
    abstract void brake();

    abstract void calculateMileage();

    abstract void steer();
}

abstract class BMW extends Car{

    @Override
    void brake() {
        System.out.println("Braking....");
    }

    @Override
    void steer() {
        System.out.println("Steering the wheel.....");
    }
    /*
    BMW is not fine implementing the mileage. He wants to contract the job to ChinaFactory.
     */

    abstract void calculateMileage();

}

class ChinaFactory extends BMW{

    @Override
    void calculateMileage() {
        System.out.println("calculating the mileage");
    }
}

public class MainCar {

    public static void main(String[] args) {

        Car car = new ChinaFactory();
        car.calculateMileage();
        car.brake();
        car.steer();

    }

}
