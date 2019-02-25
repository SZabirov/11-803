package com.company.stringprocessing;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] strs = {"ab, c. ", "AAbccE", "..aB"};
        StringProcessor sp = new StringProcessor(strs);
        ProcessingRule r = new ProcessingRule() {
            @Override
            public String process(String s) {
                s.replace(".", "ab");
                s.replace(",", "");
                return s;
            }
        };
        sp.process(r);
        System.out.println(Arrays.toString(strs));
    }
}
