package com.company.stringprocessing;

public class StringProcessor {
    String[] lines;

    public StringProcessor(String[] lines) {
        this.lines = lines;
    }

    void process(ProcessingRule rule) {
        for (int i = 0; i < lines.length; i++) {
            lines[i] = rule.process(lines[i]);
        }
    }
}
