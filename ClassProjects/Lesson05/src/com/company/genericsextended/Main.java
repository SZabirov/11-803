package com.company.genericsextended;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        LinkedList l = new LinkedList<Integer>();
        List<Double> list = new LinkedList<>();
        sumOfList(list);

    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //но, например, брать doubleValue() у элементов нельзя, т к необязательно Number
    }


    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        //list.add(new Integer(10)); - нельзя, не уверены, что там Integer
        return s;
    }



    public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
        return null;
    }






}
