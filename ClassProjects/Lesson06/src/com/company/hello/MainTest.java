package com.company.hello;

public class MainTest {
    public static void main(String[] args) {
        Hello h = new EnglishHello();
        h.sayHello();

        Hello scarFaceHello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("SAY HELLO TO MY LITTLE FRIEND");
            }
        };
        scarFaceHello.sayHello();
        Chatting c = new Chatting();
        c.greeting(scarFaceHello);
    }
}










