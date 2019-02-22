package com.company;

import com.company.mergesort.Sorter;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = getRandomArr(1000000);
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        long start1 = System.nanoTime();
        Sorter.mergeSort(arr1);
        long end1 = System.nanoTime();
//        System.out.println(Arrays.toString(arr1));
        System.out.print("слиянием: ");
        System.out.println(end1 - start1);

        long start2 = System.nanoTime();
        Sorter.selectionSort(arr2);
        long end2 = System.nanoTime();
//        System.out.println(Arrays.toString(arr2));
        System.out.print("выбором:  ");
        System.out.println(end2 - start2);

    }

    private static int[] getRandomArr(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(100000);
        }
        return arr;
    }
}
