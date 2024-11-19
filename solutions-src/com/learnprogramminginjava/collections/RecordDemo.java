package com.learnprogramminginjava.collections;

public class RecordDemo {

    public record Person(String fullName, int age) {}
    public record Order(int ID, String description) {}
}
