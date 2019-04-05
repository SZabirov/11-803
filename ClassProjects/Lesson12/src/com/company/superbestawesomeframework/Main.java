package com.company.superbestawesomeframework;

import java.util.List;

import static com.company.superbestawesomeframework.SuperBestAwesomeFramework.*;

public class Main {
    public static void main(String[] args) {
        List<SimpleStudent> list =
                getMany(SimpleStudent.class, 10);
        System.out.println(list);
    }
}
