package com.company.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main7StreamForEachExplain {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("asdfa3e");
        l.add("ertr");
        l.add("a3e");
        l.add("qpoerituertAIHKJFH");

        Consumer<String> c = s -> System.out.println(s);
        l.stream().forEach(c);

    }
}
