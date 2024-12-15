package com.learnprogramminginjava.streams;

import java.util.Random;

public class Order {
    int id;
    String customer;
    double total;


    public Order(int id, String customer, double total) {
        this.id = id;
        this.customer = customer;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", total=" + total +
                '}';
    }
}
