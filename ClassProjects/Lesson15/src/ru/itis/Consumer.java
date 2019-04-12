package ru.itis;

public class Consumer extends Thread {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isProduced()) {
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    System.out.println("Еще не готов!");
                }
                product.consume();
                System.out.println("Потребил");
                product.notify();
            }
        }
    }
}
