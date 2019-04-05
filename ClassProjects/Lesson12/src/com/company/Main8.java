package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main8 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass =
                Student.class;
        Constructor<Student> constructor =
                studentClass.getConstructor(int.class);
        Student s = constructor.newInstance(21);
        System.out.println(s);
    }
}
