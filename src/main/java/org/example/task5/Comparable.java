package org.example.task5;

import java.util.*;
import java.util.stream.Collectors;


public class Comparable {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dpple", "aanana", "book", "oclock", "computer", "ring");

        Collections.sort(words);
        for (String s : words) {
            System.out.println(s);
        }


    }
}
