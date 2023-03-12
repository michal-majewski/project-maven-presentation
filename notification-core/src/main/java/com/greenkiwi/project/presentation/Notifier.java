package com.greenkiwi.project.presentation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import static com.greenkiwi.project.presentation.NotificationCategory.*;

/**
 * @author Michal_Majewski
 */

@Component
final class Notifier {

    private final List<Notification> notifications;
    private final RandomGenerator randomGenerator;

    Notifier() {
        this.notifications = List.of(
                new Notification(URGENT, "The Huge Thunderstorm is coming!!!"),
                new Notification(GENERAL, "Something ordinary..."),
                new Notification(FINANCES, "Installments are getting higher!!!")
        );
        randomGenerator = new Random();
    }

    List<Notification> allNotifications() {
        return this.notifications;
    }

    Notification randomNotification() {
        final int randomNotificationIndex = randomGenerator.nextInt(0, 3);
        return notifications.get(randomNotificationIndex);
    }
}
