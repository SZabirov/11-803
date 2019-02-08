package com.company.brackets;

import java.util.IllegalFormatWidthException;

public class Stack {
    private char[] arr;
    private int n;

    public Stack(int capacity) {
        arr = new char[capacity];
        n = 0;
    }

    public void push(char c) {
        if (n == arr.length) {
            throw new IllegalStateException("Stack is already full");
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







