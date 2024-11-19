package com.learnprogramminginjava.polymorphism;

public class BigTruck extends PolyTruck {


    public BigTruck() {
        super();
        numWheels = 18;
        System.out.println("I am Big Truck Constructor");
        System.out.println("Big Truck Wheels " + numWheels);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Start a Big Truck");
    }

    public static void main(String[] args) {
        BigTruck bt = new BigTruck();
        bt.start();
    }
}
