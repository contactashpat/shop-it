package com.codewithash.shopit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMS")
@Primary
public class SMSNotification implements NotificationService {

    @Value("${message.api.url}")
    private String apiURL;

    @Value("${message.api.key}")
    private String apiKey;

    @Override
    public void notify(String message) {
        System.out.println("SMS " +message);
        System.out.println("apiUrl " +apiURL);
        System.out.println("apiKey " +apiKey);
    }
}
