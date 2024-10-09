package com.learnprogramminginjava.basics;

public class Canine {

    int age;
    Address home;
    boolean isVaccinated;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public Canine() {
        this.isVaccinated = false;
    }

    public Canine(String name, boolean isVaccinated, int age, Address home) {
        this.name = name;
        this.isVaccinated = isVaccinated;
        this.age = age;
        this.home = home;
    }

    /**
     * Given an Address called `from`, the function returns the number of miles
     * from the provided Address to the Canine's Address
     * @param from The provided Address to calculate the oneway distance
     * @return The number of miles, as a double, between the Canine's home and the `from`
     */
    public double getDistanceInMiles(Address from) {
        // calculate distance `from` the Canine's home address
        // Use external mapping API like Google Maps or the Phone's Mapping software
        // Implementation is not important for this example
        return 1.00;
    }

    public static void main(String[]args) {

        Canine dog = new Canine();
        dog.name = "Fido";
        dog.isVaccinated = false;
        dog.age = 5;

        // What will this print out?
        System.out.println(dog.age);
    }
}


