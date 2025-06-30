package com.codewithash.shopit;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotification implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Email " +message);
    }
}
