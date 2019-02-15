package com.company.genericqueue;

public class Queue<T> {
    //todo добавить конструкторы
    private Node first;
    private Node last;

    public void enqueue(T elem) {
        Node oldLast = last;
        last = new Node();
        last.value = elem;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue() {
        return null;//fixme add implementation
    }

    public boolean isEmpty() {
        return first == null;
    }

    class Node {
        T value;
        Node next;
    }
}
