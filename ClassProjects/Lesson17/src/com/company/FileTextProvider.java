package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
    private Logger logger = new Logger();
    private File file;

    public FileTextProvider(File file) {
        logger.info("File was created");
        this.file = file;
    }

    @Override
    public String getText() {
        try {
            Scanner sc = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()) {
                sb.append(sc.next()).append(" ");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            logger.error("File with name " + file.getName()
            + " not found");
            throw new IllegalArgumentException(e);
        }
    }

    public File getFile() {
        return file;
    }
}
