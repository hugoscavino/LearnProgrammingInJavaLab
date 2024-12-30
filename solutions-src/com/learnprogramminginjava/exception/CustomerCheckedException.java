package com.learnprogramminginjava.exception;

public class CustomerCheckedException extends Exception {

    final int customerId;

    public CustomerCheckedException(String message, int customerId) {
        super(message);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "CustomerException{" +
                "customerId=" + customerId +
                '}';
    }
}
