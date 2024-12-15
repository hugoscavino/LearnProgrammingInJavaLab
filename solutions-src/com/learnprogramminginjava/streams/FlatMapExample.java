package com.learnprogramminginjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        // A list of lists of strings
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana", "Cherry"),
                Arrays.asList("Dog", "Elephant"),
                Arrays.asList("Fish", "Goose")
        );

        // Using flatMap to flatten the list of lists into a single list of strings
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream) // Flattens each inner list into a single stream
                .toList();

        System.out.println("Flattened List: " + flattenedList);
    }
}

