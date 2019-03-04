package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main07Scanner {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new FileInputStream("input2.txt");
        Scanner sc = new Scanner(is);
        System.out.println(sc.nextLine());
    }
}








