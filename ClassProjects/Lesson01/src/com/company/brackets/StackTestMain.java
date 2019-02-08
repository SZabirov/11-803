package com.company.brackets;

public class StackTestMain {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push('1');
        s.push('2');
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
