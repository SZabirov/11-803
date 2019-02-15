package com.company.intlinkedlist;

public class IntListMain {
    public static void main(String[] args) {
        IntList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        IntIterator iter = list.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            sum += iter.next();
        }
        iter = list.iterator();
        System.out.println(sum);
    }
}
