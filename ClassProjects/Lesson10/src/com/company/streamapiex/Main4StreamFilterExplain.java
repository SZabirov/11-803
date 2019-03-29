package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main4StreamFilterExplain {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");

        Predicate<String> p = s -> s.charAt(0) == 'a' ||
                s.charAt(0) == 'A';
        List<String> resultList =
                l.stream()
                .filter(p)
                .collect(Collectors.toList());
        System.out.println(resultList);

    }
}
