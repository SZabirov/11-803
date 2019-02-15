package com.company.genericqueue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("trrr");
        String s = q.dequeue();
    }
}
