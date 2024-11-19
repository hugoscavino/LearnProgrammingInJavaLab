package com.learnprogramminginjava.reuse;

public record Engine(String name) {

    public Engine(String name) {
        this.name = name;
        System.out.println("Engine Name: " + this.name);
    }

    @Override
    public String toString() {
        return "Engine Name : [" + name + "]";
    }
}
