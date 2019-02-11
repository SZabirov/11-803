package com.company.intlinkedlist;

public class IntLinkedList implements IntList {
    private Node first;
    private int n;

    @Override
    public void add(int elem) {
        Node newNode = new Node();//создание нового узла с данным значение
        newNode.value = elem;
        if (first != null) {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            first = newNode;
        }
        n++;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("No such element with index = " + index);
        }
        if (index == 0) {
            first = first.next;
        } else {
            int i = 0;
            Node current = first;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            current.next = current.next.next;
        }
        n--;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public IntIterator iterator() {
        return new IntIteratorImpl();
    }

    class IntIteratorImpl implements IntIterator {
        Node current;

        public IntIteratorImpl() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public int next() {
            int valueToReturn = current.value;
            current = current.next;
            return valueToReturn;
        }
    }

    class Node {
        int value;
        Node next;
    }
}
