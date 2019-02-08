package com.company.stackv2;

public class StackV2 {
    private final static int INITIAL_CAPACITY = 10;
    private final static double COEFFICIENT = 1.5;
    private char[] arr;
    private int n;

    public StackV2() {
        arr = new char[INITIAL_CAPACITY];
        n = 0;
    }

    public void push(char c) {
        if (n == arr.length) {
            char[] newArray = new char[(int) (arr.length * COEFFICIENT)];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        arr[n++] = c;
    }

    public char pop() {
        if (n == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[--n];
    }

    public boolean isEmpty() {
        return n == 0;
    }
}
