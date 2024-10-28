package com.learnprogramminginjava.implementationhiding;

public class DefaultConstructor {
    private String name;
    private int age;

    // public DefaultConstructor(){
    //    System.out.println("name " + name + " age " + age);
    // }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();
        System.out.println(dc.name);
        System.out.println(dc.age);
    }
}

