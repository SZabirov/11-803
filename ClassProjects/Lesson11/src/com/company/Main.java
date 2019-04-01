package com.company;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>();
        bst.insert(17);
        bst.insert(26);
        bst.insert(10);
        bst.insert(30);
        bst.printAll();
    }
}
