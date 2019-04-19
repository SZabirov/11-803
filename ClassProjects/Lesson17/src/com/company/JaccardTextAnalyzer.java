package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JaccardTextAnalyzer implements
        TextAnalyzer {
    private Logger logger = new Logger();

    @Override
    public double analyze(TextProvider tp1, TextProvider tp2) {
        String text1 = tp1.getText();
        String text2 = tp2.getText();
        logger.info("Text from textProviders get");
        Set<String> uniqueWords1 = getUnique(tokenize(text1));
        Set<String> uniqueWords2 = getUnique(tokenize(text2));
        int intersectionsCount = 0;
        for (String s : uniqueWords1) {
            if (uniqueWords2.contains(s)) {
                intersectionsCount++;
            }
        }
        logger.info("intersectionsCount = " + intersectionsCount);
        double coef = (double) intersectionsCount /
                (uniqueWords1.size() + uniqueWords2.size()
                - intersectionsCount);
        return coef;
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "")
                .replace(".", "")
                .toLowerCase();
        return Arrays.asList(text.split(" "));
    }

    private Set<String> getUnique(List<String> tokens) {
        return new HashSet<>(tokens);
    }
}
