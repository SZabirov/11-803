package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main7 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> aClass = Student.class;
        Method m = aClass
                .getDeclaredMethod("passExam",
                        String.class, int.class);
        m.setAccessible(true);
        Student s = new Student(45);
        s.name = "Алиса";
        m.invoke(s, "алгем", 3);
    }
}
