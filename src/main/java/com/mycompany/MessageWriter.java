package com.mycompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MessageWriter {

    void write(String file, String message) throws FileNotFoundException {

        try (PrintWriter printWriter = new PrintWriter(new File(file))) {

            printWriter.print(message);
            printWriter.flush();

        }

    }
}
