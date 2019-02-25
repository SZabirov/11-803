package com.company.stringprocessing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] strs = {"ab, c. ", "AAbccE", "..aB"};
        StringProcessor sp = new StringProcessor(strs);
        sp.process(new LowerCaseProcessingRule());
        System.out.println(Arrays.toString(strs));
    }
}
