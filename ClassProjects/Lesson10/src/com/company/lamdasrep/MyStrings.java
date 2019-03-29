package com.company.lamdasrep;

public class MyStrings {
    private String strings[];
    private int count;

    public MyStrings() {
        strings = new String[10];
    }

    void add(String s) {
        strings[count++] = s;
    }

    public void processAll(MyFunction function) {
        for (int i = 0; i < count; i++) {
            strings[i] = function.process(strings[i]);
        }
    }

    void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(strings[i]);
        }
    }
}
