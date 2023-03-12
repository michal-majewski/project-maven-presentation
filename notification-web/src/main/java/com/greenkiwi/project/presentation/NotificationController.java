package com.greenkiwi.project.presentation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Michal_Majewski
 */
@Controller
@RequestMapping("/notifications")
@AllArgsConstructor
final class NotificationController {
    private final Notifier notifier;

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
