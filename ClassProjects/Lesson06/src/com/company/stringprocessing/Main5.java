package com.company.stringprocessing;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        String[] strs = {"ab, c. ", "AAbccE", "..aB"};
        StringProcessor sp = new StringProcessor(strs);
        //правило, приводит к lowerCase
        sp.process(s -> s.toLowerCase());
        sp.process(s -> s.replace(" ", "*"));
        System.out.println(Arrays.toString(strs));
    }
}
