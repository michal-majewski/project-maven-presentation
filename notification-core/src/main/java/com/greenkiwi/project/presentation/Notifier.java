package com.greenkiwi.project.presentation;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import static com.greenkiwi.project.presentation.NotificationCategory.*;

/**
 * @author Michal_Majewski
 */
final class Notifier {

    private final List<Notification> notifications;
    private final RandomGenerator randomGenerator;

    Notifier() {
        this.notifications = List.of(
                new Notification(NotificationCategory.URGENT, "The Huge Thunderstorm is coming!!!"),
                new Notification(NotificationCategory.GENERAL, "Something ordinary..."),
                new Notification(NotificationCategory.FINANCES, "Installments are getting higher!!!")
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
