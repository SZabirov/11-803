package com.company;

import java.lang.reflect.Field;

public class Main3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class c = Student.class;
        Field f = c.getDeclaredField("age");
        Student s = new Student(25);
        f.setAccessible(true);
        f.set(s, 90);
        System.out.println(s);
    }
}
