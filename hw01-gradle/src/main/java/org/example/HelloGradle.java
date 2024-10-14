package org.example;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloGradle {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<List<Integer>> partitions = Lists.partition(numbers, 3);

        System.out.println("Результат: " + partitions);
    }
}