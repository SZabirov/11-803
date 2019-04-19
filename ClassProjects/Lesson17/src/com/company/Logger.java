package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private final static String FILE_NAME = "log.txt";
    private PrintWriter writer;

    public Logger() {
        File f = new File(FILE_NAME);
        try {
            writer = new PrintWriter(new FileOutputStream(f, true));
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(
                    "Unable to create logger"
            );
        }
    }

    void info(String message) {
        writer.println("INFO " + LocalDateTime.now() +
                " " + message);
        writer.flush();
    }

    void error(String message) {
        writer.println("ERROR " + LocalDateTime.now() +
                " " + message);
        writer.flush();
    }
}
