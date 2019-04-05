package com.company.threedots;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Анастасия", "Алина"};
        printAll(names);
        printAll("Сабина", "Дина");
    }

    private static void printAll(String... names) {
        Arrays.stream(names)
                .forEach(System.out::println);
    }

//    private static void printAll(String[] names) {
//        Arrays.stream(names)
//                .forEach(System.out::println);
//    }
}
