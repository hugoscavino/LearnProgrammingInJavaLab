package com.learnprogramminginjava.collections;

import java.util.*;

public class ListDemo {

    public static abstract class Animal{
        protected final String name;
        public Animal(String name){
            this.name = name;
        }
        protected abstract void speak();
    }

    public static class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }

        @Override
        protected void speak() {
            System.out.println("Woof");
        }
    }
    public static class Cat extends Animal{
        public Cat(String name) {
            super(name);
        }

        @Override
        protected void speak() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal dawg = new Dog("Dawg");
        Animal fido = new Dog("Fido");
        animals.add(fido);
        animals.add(dawg);

        final int count = animals.size();
        System.out.println("Animals in List [" + count + "]");

        boolean fidoFound = animals.contains(fido);
        System.out.println("Is Fido in List? [" + fidoFound + "]");

        boolean removed = animals.remove(dawg);
        System.out.println("Was dawg removed [" + removed + "]");
        System.out.println("Animals in List [" + animals.size() + "]");


        // Iterating using for loop
        for (int i = 0; i < animals.size(); i++){
            // Printing and display the elements in ArrayList
            System.out.print(animals.get(i) + " ");
        }

        // Step 1: Setting and initializing a variable
        // as per syntax of while loop
        int val = 0;

        // Step 2: Condition
        // Till our counter variable is lesser than size of
        // ArrayList
        while (animals.size() > val) {
            System.out.println(animals.get(val));
            // Step 3: Terminating condition by incrementing
            // our counter in each iteration
            val++ ;
        }

        // For Each Loop for iterating ArrayList
        for (Animal animal : animals) {
            // Printing the elements of ArrayList
            System.out.print(animal + " ");
        }

        // Iterating ArrayList using Iterator
        Iterator it = animals.iterator();

        // Holds true till there is single element
        // remaining in the list
        while (it.hasNext()) {
            // Print the elements of ArrayList
            System.out.print(it.next() + " ");
        }

        // Getting an enumeration object
        Enumeration<Animal> e
                = Collections.enumeration(animals);
        // Till elements are there
        while (e.hasMoreElements()){
            // Print elements using nextElement() method
            System.out.println(e.nextElement());
        }

        // Printing numbers using lambda expressions
        animals.forEach(System.out::println);
    }
}
