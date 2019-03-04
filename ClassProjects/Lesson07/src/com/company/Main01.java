package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main01 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input1.txt");
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());

    }
}








