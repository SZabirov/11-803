package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;

public class Main6StreamFinal {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");

        l.stream()
                .filter(s -> s.charAt(0) == 'a')
                .map(s -> s.length())
                .forEach(i -> System.out.println(i));

    }
}
