package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input2.txt");
        byte[] bytes = new byte[16];
        int length = is.read(bytes);
        String str = new String(bytes, 0, length, StandardCharsets.UTF_8);
        System.out.println(str);
        is.close();
    }
}










