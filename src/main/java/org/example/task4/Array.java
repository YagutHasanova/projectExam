package org.example.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Array {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,4,8,9,10,1,11,9,8);
        list.stream()
                .filter(n -> n % 2 == 0 || n%5 !=0)
                .forEach(System.out::println);
    }
}