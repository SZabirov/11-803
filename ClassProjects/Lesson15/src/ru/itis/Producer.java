package ru.itis;

public class Producer extends Thread {
    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isConsumed()) {
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    System.out.println("Еще не потреблен");
                }
                product.produce();
                System.out.println("Произвел");
                product.notify();

            }
        }
    }
}