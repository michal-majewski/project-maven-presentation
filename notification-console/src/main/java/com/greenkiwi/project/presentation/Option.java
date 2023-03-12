package com.greenkiwi.project.presentation;

import java.util.function.Supplier;

/**
 * @author Michal_Majewski
 */
final class Option<T> {
    private final String name;
    private final Supplier<T> content;

    Option(final String notificationMessage, final Supplier<T> action) {
        this.name = notificationMessage;
        this.content = action;
    }


    String name() {
        return this.name;
    }

    T content() {
        return content.get();
    }
}
