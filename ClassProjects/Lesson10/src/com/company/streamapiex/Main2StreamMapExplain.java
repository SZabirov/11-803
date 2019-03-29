package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2StreamMapExplain {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");

        Stream<String> stream = l.stream();
        Function<String, Integer> f = s -> s.length();
        Stream<Integer> stream1 = stream.map(f);
        List<Integer> result =
                stream1.collect(Collectors.toList());
        System.out.println(result);
    }
}











