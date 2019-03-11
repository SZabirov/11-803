package com.company.iterators;

public class Main2 {
    public static void main(String[] args) {
        MyIntArray mia = new MyIntArray();
        mia.add(5);
        mia.add(10);
        mia.add(15);
        for (Integer i : mia) {
            System.out.println(i);
        }
        for (Integer i :
             mia) {

        }
    }
}
