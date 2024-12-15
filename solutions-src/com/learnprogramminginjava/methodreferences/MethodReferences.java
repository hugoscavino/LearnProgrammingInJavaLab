package com.learnprogramminginjava.methodreferences;

public class MethodReferences {

    // I am a static method!
    static void sayHello(String s){
        System.out.println("Hello, user " + s);
    }

    static class Assistant{
        static void assist(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {

        //[1]
        // Create an instance of the Discuss class
        Discuss discuss = new Discuss("Coffee Tables");

        // We are equating methods with the same
        // signatures to each other
        Callable c = discuss::amongstOurselves;

        // You can invoke amongstOurselves() by calling call(), because Java maps
        // call() onto amongstOurselves().
        c.call("Calling call() with amongstOurselves() method");

        //[2]
        // Now assign a static method defined in our class
        // You can invoke sayHello() by calling call(), because Java maps
        // call() onto sayHello().
        c = MethodReferences::sayHello;
        c.call("a static method reference");

        //[3]
        // Similar to above, a method reference attached to a live
        // object, sometimes referred to as "bound method reference"
        // the construction and method reference declared and assigned
        // all on one line
        c = new Discuss("Coffee Chairs")::amongstOurselves ;
        c.call("a static method reference");

        //[4]
        // Method reference for a static method of a
        // static inner class is the same as making
        // a reference to an outer class
        c = Assistant::assist;
        c.call("Assist Me!");
    }

}
