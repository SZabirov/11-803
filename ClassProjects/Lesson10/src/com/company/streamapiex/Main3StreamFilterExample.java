package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3StreamFilterExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");

        List<String> resultList =
                l.stream()
                .filter(s -> s.charAt(0) == 'a')
                .collect(Collectors.toList());

    }
}
