package com.codewithash.shopit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(@Qualifier("SMS") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.notify(message);
    }
}
