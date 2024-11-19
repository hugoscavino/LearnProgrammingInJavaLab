package com.learnprogramminginjava.polymorphism;

public class PolyTruck extends Vehicle {

    public PolyTruck() {
        super();
        System.out.println("PolyTruck Constructor");
    }

    @Override
    public void start(){
        System.out.println("Start Truck");
    }

    /**
     * Truck Specific method
     */
    public void dropCargo(){
        System.out.println("Drop cargo");
    }
}
