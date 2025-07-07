package com.codewithash.shopit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class NotificationManagerTest {
    private NotificationService notificationService;
    private NotificationManager notificationManager;

    @BeforeEach
    void setUp() {
        notificationService = mock(NotificationService.class);
        notificationManager = new NotificationManager(notificationService);
    }

    @Test
    void notify_delegatesToNotificationService() {
        String message = "Test message";
        notificationManager.notify(message);
        verify(notificationService, times(1)).notify(message);
    }
} 