package com.learnprogramminginjava.implementationhiding;

public class DefaultConstructorWithDefaults {
    private final String name;
    private final int age;

    public DefaultConstructorWithDefaults() {
        name = "John Doe";
        age = 18;
    }
    public static void main(String[] args) {
        DefaultConstructorWithDefaults dc = new DefaultConstructorWithDefaults();
        System.out.println(dc.name);
        System.out.println(dc.age);
    }

}
