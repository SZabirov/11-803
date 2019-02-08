package com.company.brackets;

import java.util.Scanner;

public class BracketsTestMain {
    public static void main(String[] args) {
        //{[(5+3)*8+8]-7*[3+5*6]}
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = areBracketsCorrect(s);
        System.out.println(b);
    }

    static boolean areBracketsCorrect(String str) {
        Stack stack = new Stack(100);
        char[] symbols = str.toCharArray();
        for(char c : symbols) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //если закрывающая скобока, то достать
                //элемент из стека, убедиться, что подходят
            }
        }
        return false;
    }
}






