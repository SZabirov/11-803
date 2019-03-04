package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main04 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input2.txt");
        int i;
        while ((i = is.read()) != -1) {
            System.out.println(i);
        }
    }
}
