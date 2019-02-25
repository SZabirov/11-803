package com.company.hello;

public class CoolMain {
    public static void main(String[] args) {
        CoolHello ch = new CoolHello("groove st.") {
            @Override
            public void showFingerSign() {
                System.out.println("Что-то показал на пальцах");
            }
        };
        ch.sayHello();
    }
}
