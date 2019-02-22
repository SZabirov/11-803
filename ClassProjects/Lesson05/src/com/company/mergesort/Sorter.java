package com.company.mergesort;

public class Sorter {
    private static int[] helper;

    public static void mergeSort(int[] arr) {
        helper = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;//граница разбиения
        sort(arr, low, mid);//сортируем левую часть
        sort(arr, mid + 1, high);//сортируем правую часть
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            helper[k] = arr[k];
        }
        int k = low;
        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                arr[k++] = helper[i++];
            } else {
                arr[k++] = helper[j++];
            }
        }
        //выписыаем подряд из левой части, если остались
        while (i <= mid) {
            arr[k++] = helper[i++];
        }
        //выписыаем подряд из правой части, если остались
        while (j <= high) {
            arr[k++] = helper[j++];
        }
    }




    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[indexOfMax] < arr[j]) {
                    indexOfMax = j;
                }
            }
            int b = arr[indexOfMax];
            arr[indexOfMax] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = b;
        }
    }
}
