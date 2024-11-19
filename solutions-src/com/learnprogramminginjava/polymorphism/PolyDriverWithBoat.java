package com.learnprogramminginjava.polymorphism;

public class PolyDriverWithBoat {

    public static void main(String[] args) {
        PolyDriverWithBoat driver = new PolyDriverWithBoat();

        Vehicle car = new PolyCar();                // Car has a start method from the Startable interface
        Vehicle truck = new PolyTruck();          // Truck has a start method also from same interface
        Vehicle boat = new PolyBoat();
        Vehicle[] vehicles = {car, truck, boat};
        driver.startVehicles(vehicles); // This signature and interface is flexible
    }

    /**
     * Code does NOT Change!
     * @param vehicles Array of Vehicles
     */
    public void startVehicles(Vehicle[] vehicles) {

        for (Vehicle vehicle : vehicles) {
            vehicle.start(); // LOOK Code does not know if this is a
            // PolyCar, PolyTruck or PolyBoat!

            // If you must know the type you interrogate the type
            // Be careful this is generally a code smell!
            if (vehicle instanceof PolyTruck truck){
                truck.dropCargo();
            }
        }
    }
}
