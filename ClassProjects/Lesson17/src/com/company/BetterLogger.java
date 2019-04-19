package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//singleton
public class BetterLogger {
    private final static String FILE_NAME = "log.txt";
    private PrintWriter writer;

    private static BetterLogger INSTANCE;

    public static BetterLogger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BetterLogger();
        }
        return INSTANCE;
    }

    private BetterLogger() {
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
