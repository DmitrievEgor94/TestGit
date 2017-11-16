package com.mycompany;

import java.io.FileNotFoundException;

public class Main {
    
    private static String NAME_OF_FILE = "test.txt";

    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();

        try {
            messageWriter.write(NAME_OF_FILE, "Hello world!");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
