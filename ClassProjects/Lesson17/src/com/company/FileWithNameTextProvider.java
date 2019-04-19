package com.company;

import java.io.File;

//класс, декорирующий FileTextProvider
public class FileWithNameTextProvider implements TextProvider {
    private FileTextProvider fileTextProvider;

    public FileWithNameTextProvider(FileTextProvider fileTextProvider) {
        this.fileTextProvider = fileTextProvider;
    }

    public FileWithNameTextProvider(File file) {
        fileTextProvider = new FileTextProvider(file);
    }

    @Override
    public String getText() {
        String text = fileTextProvider.getText();
        return fileTextProvider.getFile().getName() + " " + text;
    }
}
