package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.UUID;

public class Collisions {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        int[] arr = new int[16];
        for (int i = 0; i < 10000; i++) {
            String s = getRandomString();
            int hashcode = s.hashCode();
            int index = Math.abs(hashcode) % 16;
            arr[index]++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static String getRandomString() {
        return UUID.randomUUID().toString();
    }
}
