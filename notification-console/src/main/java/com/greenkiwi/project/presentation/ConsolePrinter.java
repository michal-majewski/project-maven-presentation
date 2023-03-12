package com.greenkiwi.project.presentation;

import java.io.PrintStream;
import java.util.List;

/**
 * @author Michal_Majewski
 */
final class ConsolePrinter {

    private final PrintStream printStream;
    private final Notifier notifier;
    private final List<Option> options;

    ConsolePrinter() {
        this.printStream = System.out;
        this.notifier = new Notifier();
        options = List.of(
                new Option<List<Notification>>("Show all notifications", () -> notifier.allNotifications()),
                new Option<Notification>("Show random notification", () -> notifier.randomNotification()),
                new Option<String>("Exit", () -> "GoodBye!")
        );
    }

    void presentMenu() {
        int counter = 0;
        for (final Option option : options) {
            printStream.println(counter + ". " + option.name());
            counter++;
        }
    }

    boolean presentOption(final int chosenOption) {
        final int exitOptionIndex = options.size() - 1;
        presentOptionContent(chosenOption);
        return chosenOption != exitOptionIndex;
    }

    private void presentOptionContent(final int chosenOption) {
        printStream.println(options.get(chosenOption).content());
        printStream.println();
    }
}
