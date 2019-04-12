package com.company;

public class Calculator {
    public boolean isSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }

    public int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Argument should be >= 0");
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
