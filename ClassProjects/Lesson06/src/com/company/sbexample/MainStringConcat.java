package com.company.sbexample;

public class MainStringConcat {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s.append("hello");
        }
        String result = s.toString();
        System.out.println(s.charAt(10000));

        String str = "abc" + "cde" + "aaa";

//        String s = "";
//        for (int i = 0; i < 100000; i++) {
//            s = s + "hello";
//        }
//        System.out.println(s.charAt(10000));
    }
}
