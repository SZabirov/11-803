package com.company.lists;

public class ArrayIntList implements IntList {
    private final static int INITIAL_CAPACITY = 10;
    private final static double COEFFICIENT = 1.5;
    private int[] arr;
    private int n;

    @Override
    public void add(int elem) {
        if (n == arr.length) {
            int[] newArray = new int[(int) (arr.length * COEFFICIENT)];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        arr[n++] = elem;
    }

    @Override
    public void add(int elem, int position) {

    }


    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void sort() {

    }

    @Override
    public void addAll(IntList list, int position) {

    }

    @Override
    public int lastIndexOf(int elem) {
        return 0;
    }
}
