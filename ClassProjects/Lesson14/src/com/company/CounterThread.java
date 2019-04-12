package com.company;

import com.company.firstexample.Main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    private static final Object MUTEX = new Object();
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
//            synchronized (MUTEX) {
            lock.lock();
            MainApp.sum = MainApp.sum + array[i];
            lock.unlock();
//            }
        }
    }
}
