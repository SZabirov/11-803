package com.company.generics;

public class SomeList<T> {
    T[] elements;
    int n = 0;

    public SomeList() {
        elements = (T[]) new Object[10];
    }

    public void add(T s) {
        elements[n++] = s;
    }
}
