package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchMain {
    public static void main(String[] args) {
        File folder = new File("abc");
        List<File> fileList = new ArrayList<>();
        List<TextProvider> providers = fileList
                .stream()
                .map(FileTextProvider::new)
                .collect(Collectors.toList());
        TextProvider textProvider =
                new SimpleTextProvider("мой реферат");

    }
}
