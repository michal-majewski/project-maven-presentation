package com.greenkiwi.project.presentation;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Michal_Majewski
 */
final class ConsoleReader {

    private final InputStream inputStream;

    ConsoleReader() {
        this.inputStream = System.in;
    }

    int readOption() {
        final Scanner scanner = new Scanner(inputStream);
        return scanner.nextInt();
    }
}
