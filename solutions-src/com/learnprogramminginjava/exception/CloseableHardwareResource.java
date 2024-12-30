package com.learnprogramminginjava.exception;

// Class now implements AutoCloseable and can be used in a try-with-resource blockCloseableHardwareResource
public class CloseableHardwareResource implements AutoCloseable{

    // Wrapper over some scare resource like a socket or sprinkler
    public CloseableHardwareResource() throws Exception {
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

    private void stop(){
        // Close connections
        // Call some hardware API
        System.out.println("Hardware resource stopped");
    }

    @Override
    public void close() throws Exception {
        stop();
    }
}
