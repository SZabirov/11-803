package com.company.superbestawesomeframework;

import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {
    public static <T> List<T> getMany(Class<T> c, int count) {
        List<T> list = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                list.add(c.newInstance());
            }
        } catch (InstantiationException |
                IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return list;
    }

    //создаем список из count штук объектов типа T,
    //каждый из которых создан путем вызова
    //конструктора класса с набором аргументов args
    public static <T> List<T> getMany(Class<T> c, int count,
                                      Object... args) {
        return null;
    }
}
