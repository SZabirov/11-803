package com.company.iterators;

import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        MyIntArray mia = new MyIntArray();
        mia.add(5);
        mia.add(10);
        mia.add(15);
        Iterator<Integer> iterator = mia.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
