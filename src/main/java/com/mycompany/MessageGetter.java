package com.mycompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MessageGetter {

    String get(String file) throws FileNotFoundException {

        StringBuilder message = new StringBuilder("");

        try (Scanner scanner = new Scanner(new File(file))) {

            while (scanner.hasNext()) {
                message.append(scanner.nextLine());
            }
        }

        return message.toString();
    }

}
