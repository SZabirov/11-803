package com.company;

public class Main5 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Student> c = Student.class;
        Student s = c.newInstance();
        s.name = "Салават";
        System.out.println(s);
    }
}
