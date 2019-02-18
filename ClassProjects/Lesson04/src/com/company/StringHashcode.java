package com.company;

public class StringHashcode {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        String s2 = new String("bbb");
        String s3 = new String("abcd");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
