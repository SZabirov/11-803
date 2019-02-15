package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(s);
        }
    }
}
