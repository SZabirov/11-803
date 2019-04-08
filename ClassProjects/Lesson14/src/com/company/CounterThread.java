package com.company;

import com.company.firstexample.Main;

public class CounterThread extends Thread {
    //суммирует значения в массиве, начиная со start, заканчивая end
    private int start;
    private int end;
    private int[] array;

    public CounterThread(int start, int end, int[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            MainApp.sum = MainApp.sum + array[i];
        }
    }
}
