package com.learnprogramminginjava.streams;

import java.util.Arrays;
import java.util.List;

public class CollectionToStreamDemo {
    public static void main(String[] args) {

        List<Movie> movieList = Arrays.asList(new Movie(1, "Conan", 1984),
                new Movie(2, "The Godfather", 1972),
                new Movie(3, "The Godfather: Part II", 1974));

        movieList.stream().forEach(System.out::println);
        // movieList.forEach(System.out::println);



    List<Order> orders = List.of(   new Order(100,"Customer1", 10.00),
                                    new Order(200, "Customer2", 12.50),
                                    new Order(300, "Customer3", 99.45));
    System.out.println("Grand Total : " + orders.stream().
                        mapToDouble(total -> total.total).
                        sum());

    System.out.println("---------------------- WITH PEAK-------------------------");

    System.out.println("Grand Total with Peek: $" + orders.stream().
                peek(o -> System.out.println("Order Total : $" + o.total)).
                mapToDouble(total -> total.total).
                sum());

    Object[] array = orders.stream().toArray();
    for (Object o : array) {
        System.out.println(o);
    }

    }



}
