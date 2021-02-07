package com.example.demo.api.ploymorphism;

//Toyota

//1.8 +
//1.7
/*
1.8 -> functional style of programming
interfaces

asbtract
    concrete methods
        void concreteMehtod(){
        }

 */
interface Car {

    void brake();

    void steer();


}

class BMW implements Car {
    @Override
    public void brake() {
        System.out.println("Braking the car.....");
    }

    @Override
    public void steer() {
        System.out.println("Steering the car.....");
    }

    ;


}

class Audi implements Car {
    @Override
    public void brake() {
        System.out.println("Braking the car little fast.....");
    }

    @Override
    public void steer() {
        System.out.println("Steering the car little fast.....");
    }


}

public class MainClass {

    //Method overloading
    /*
    same name different parameters
     */
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Car carDriver = new Audi();
        carDriver.brake();

        Car car1 = new BMW();
        car1.brake();
    }

}
