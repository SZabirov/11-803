package com.company;

public class Student {
    private int age;
    public String name;

    private void passExam(String exam) {
        System.out.println(exam + " сдал на изи");
        System.out.println("Кстати, я " + name);
    }

    private void passExam(String exam, int countOfTries) {
        System.out.println(exam + " сдал c " +
                countOfTries + " попытки, думал, что" +
                " отчислят");
    }

    private void passExam(String exam, Integer point) {
        System.out.println("Сдал " + exam + " на " +
                point + " баллов");
    }

    private void passExam(int countOfDopkas) {
        System.out.println("Я закрыл целых " +
                countOfDopkas + " допок!");
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
