package com.company.firstexample;

public class EvilThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". SUFFER!!!");
        }
    }
}
