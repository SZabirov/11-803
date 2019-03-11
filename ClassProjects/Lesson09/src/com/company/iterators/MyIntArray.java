package com.company.iterators;

import java.util.Iterator;

public class MyIntArray implements Iterable<Integer> {
    private Integer[] arr = new Integer[10];
    private Integer count = 0;

    public void add(Integer elem) {
        arr[count++] = elem;
    }

    public Integer get(Integer index) {
        return arr[index];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorImpl();
    }
    
    public class IteratorImpl implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public Integer next() {
            return arr[currentIndex++];
        }
    }
}
