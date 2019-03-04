package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input1.txt");
        byte[] bytes = new byte[16];
        int length = is.read(bytes);
        System.out.println(length);
        System.out.println(Arrays.toString(bytes));
        char c = '\n';
    }
}










