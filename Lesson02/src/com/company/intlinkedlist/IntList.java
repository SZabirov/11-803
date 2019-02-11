package com.company.intlinkedlist;

public interface IntList {
    void add(int elem);
    int get(int index);
    void remove(int index);
    boolean isEmpty();
    IntIterator iterator();
}
