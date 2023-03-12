package com.greenkiwi.project.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Michal_Majewski
 */
@Controller
@RequestMapping("/notifications")
final class NotificationController {
    private final Notifier notifier;

    NotificationController() {
        this.notifier = new Notifier();
    }

    @GetMapping
    String allNotifications(Model model) {
        model.addAttribute("notifications", notifier.allNotifications());
        return "notifications";
    }

    @GetMapping("/random")
    String randomNotification(Model model) {
        model.addAttribute("randomNotification", notifier.randomNotification());
        return "randomNotification";
    }
}
