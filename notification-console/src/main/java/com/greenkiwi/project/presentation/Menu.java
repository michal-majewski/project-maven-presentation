package com.greenkiwi.project.presentation;

/**
 * @author Michal_Majewski
 */
final class Menu {
    private final ConsoleReader reader;
    private final ConsolePrinter printer;

    Menu() {
        reader = new ConsoleReader();
        printer = new ConsolePrinter();
    }

    void start() {
        boolean isTerminated = false;

        do {
            printer.presentMenu();
            int chosenOption = reader.readOption();
            isTerminated = printer.presentOption(chosenOption);
        } while (isTerminated);
    }
}
