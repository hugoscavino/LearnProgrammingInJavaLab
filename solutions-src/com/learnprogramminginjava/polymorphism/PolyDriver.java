package com.learnprogramminginjava.polymorphism;

public class PolyDriver {

    public static void main(String[] args) {
        PolyDriver driver = new PolyDriver();

        Vehicle car = new PolyCar();                // Car has a start method from the Startable interface
        Vehicle truck = new PolyTruck();          // Truck has a start method also from same interface
        Vehicle[] vehicles = {car, truck};
        driver.startVehicles(vehicles); // This signature and interface is flexible
    }

    public void startVehicles(Vehicle[] vehicles) {

        for (Vehicle vehicle : vehicles) {
            vehicle.start(); // LOOK Code does not know if this is a PolyCar or PolyTruck!

            // If you must know the type you interrogate the type
            // Be careful this is generally a code smell!
            if (vehicle instanceof PolyTruck truck){
                truck.dropCargo();
            }
        }
    }
}
