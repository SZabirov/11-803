package com.company.stringprocessing;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String[] strs = {"ab, c. ", "AAbccE", "..aB"};
        StringProcessor sp = new StringProcessor(strs);
        //правило, приводит к lowerCase
        ProcessingRule r = s -> s.toLowerCase();
        sp.process(r);
        System.out.println(Arrays.toString(strs));
    }
}
