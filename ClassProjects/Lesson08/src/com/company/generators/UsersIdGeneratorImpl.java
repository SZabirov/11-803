package com.company.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UsersIdGeneratorImpl implements IdGenerator {
    @Override
    public Long getNext() {
        try {
            Scanner sc = new Scanner(new File("id_generator.txt"));
            Long currentId = sc.nextLong();
            sc.close();
            PrintWriter pw = new PrintWriter(new File("id_generator.txt"));
            pw.println(currentId + 1);
            pw.close();
            return currentId + 1;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File not found");
        }
    }
}
