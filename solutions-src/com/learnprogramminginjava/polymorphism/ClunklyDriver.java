package com.learnprogramminginjava.polymorphism;

public class ClunklyDriver {


    public static void main(String[] args) {

        ClunklyDriver driver = new ClunklyDriver();
        Car car = new Car();                // Car has a start method
        Truck truck = new Truck();          // Truck has a start method i.e. similar functionality to Car's
        // Are these not both vehicles?
        // What happens when I add a Boat?

        driver.clunkyStart(car, truck); // This interface is brittle

    }

    public void clunkyStart(Car car, Truck truck) {
        car.start();     // Call the Car's start method
        truck.start();   // Call the Truck's start method

    }
}
