package com.company.stringprocessing;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] strs = {"ab, c. ", "AAbccE", "..aB"};
        StringProcessor sp = new StringProcessor(strs);
        //правило, убирающее все пробелы и привод. к upperCase
        ProcessingRule r = s -> {
            String res = s.replace(" ", "");
            res = res.toUpperCase();
            return res;
        };
        sp.process(r);
        System.out.println(Arrays.toString(strs));
    }
}
