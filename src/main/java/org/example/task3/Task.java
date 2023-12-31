package org.example.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("book", "computer", "ananas", "water", "eye");

        List<String> sortedByLength = words.stream()
                .sorted((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                .collect(Collectors.toList());

        sortedByLength.forEach(System.out::println);
    }
}