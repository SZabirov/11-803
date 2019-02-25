package com.company.stringprocessing;

public class LowerCaseProcessingRule implements ProcessingRule {
    @Override
    public String process(String s) {
        return s.toLowerCase();
    }
}
