package com.learnprogramminginjava.exception;

import java.util.Random;

public class RethrowException {

    // No Exception in the signature
    void mayOrMayThrow()  {
        boolean someCondition = new Random().nextBoolean();
        if(someCondition){
            throw new CustomRuntimeException();
        }

    }
    // The exception is part of the signature
    void foreverThrowing() throws CustomerCheckedException {
        throw new CustomerCheckedException("I always throw!", 100);
    }

    void demo() throws CustomerCheckedException {
        try {
            foreverThrowing();
        }
        catch (CustomerCheckedException ce){
            // Do something with the Exception or don't bother
            System.out.println("Caught CustomerException: " + ce.getMessage());
            throw ce;
        }
    }
}
