package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        TextProvider provider1 =
                new SimpleTextProvider("Рама мама");
        File f = new File("someText.txt");
        FileTextProvider ftp = new FileTextProvider(f);

        TextAnalyzer analyzer = new JaccardTextAnalyzer();
        double coef = analyzer.analyze(provider1, ftp);
        TextProvider fwntp =
                new FileWithNameTextProvider(ftp);
        analyzer.analyze(provider1, fwntp);
        System.out.println(coef);

    }
}
