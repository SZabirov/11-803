package com.company.firstexample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	    Thread funny = new FunnyThread();
	    Thread evil = new EvilThread();

	    funny.start();
	    evil.start();

	    Thread.sleep(10000);

	    funny.join();
	    evil.join();

		for (int i = 0; i < 100; i++) {
			System.out.println(i + ". Main");
		}
    }
}
