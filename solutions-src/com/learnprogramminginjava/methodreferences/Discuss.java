package com.learnprogramminginjava.methodreferences;

public class Discuss {
    String description;

    // ctor
    public Discuss(String description) {
        this.description = description;
    }
    // Class method has the same signature as
    // the Callable interface
    void amongstOurselves(String s) {
        // The below represents an available
        // implementation
        System.out.println(s);
    }
}
