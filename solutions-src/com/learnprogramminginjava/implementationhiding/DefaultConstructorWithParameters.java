package com.learnprogramminginjava.implementationhiding;

public class DefaultConstructorWithParameters {
    private final String name;
    private final int age;

    /**
     * If you define a constructor, the default constructor generated
     * by the compiler is no longer generated.
     * @param name Name
     * @param age Age
     */
    public DefaultConstructorWithParameters(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public boolean isAdult(){
        return age >= 18;
    }

    public static void main(String[] args) {
        // DefaultConstructorWithParameters defNoParams = new DefaultConstructorWithParameters();

        DefaultConstructorWithParameters def = new DefaultConstructorWithParameters("Jane Doe", 21);
        System.out.println(def.getName());
        System.out.println(def.getAge());
        System.out.println(def.isAdult());
    }
}
