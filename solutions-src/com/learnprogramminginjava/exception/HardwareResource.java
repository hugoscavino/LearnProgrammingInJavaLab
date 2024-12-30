package com.learnprogramminginjava.exception;

public class HardwareResource {

    // Wrapper over some scare resource like a socket or sprinkler
    public HardwareResource() throws Exception {
        boolean available = true;
        if (!available) {
            throw new Exception("Hardware resource not available");
        }
    }

    public void start(){
        // open connections
        // Call some hardware API
        System.out.println("Hardware resource started");
    }

    public void stop(){
        // Close connections
        // Call some hardware API
        System.out.println("Hardware resource stopped");
    }
}
