package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1StreamMap {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");
        List<Integer> lengths1 = new ArrayList<>();
        for (String s : l) {
            lengths1.add(s.length());
        }
        System.out.println(lengths1);


        List<Integer> lengths2 = l.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lengths2);
    }
}











