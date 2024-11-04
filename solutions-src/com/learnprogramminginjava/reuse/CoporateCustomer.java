package com.learnprogramminginjava.reuse;

public class CoporateCustomer extends Customer {

    private final String tin;

    public CoporateCustomer(String tin, String name, String phone) {
        super(name, phone);
        this.tin = tin;
    }

    public String getTin() {
        return tin;
    }


}
