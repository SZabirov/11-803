package com.company;

public interface BinarySearchTree<T extends Comparable> {
    void insert(T elem);
    boolean remove(T elem);
    boolean contains(T elem);
    void printAll();
    void printAllByLevels();
}
