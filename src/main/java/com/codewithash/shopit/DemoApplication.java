package com.codewithash.shopit;

import com.codewithash.shopit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private NotificationManager notificationManager;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        notificationManager.notify("Hi World!");
    }

    @Bean
    CommandLineRunner runner(UserRepository repo) {
        return args -> {
            repo.save(new User(null, "Ash", "ash@example.com"));
            repo.findAll().forEach(System.out::println);
        };
    }
}
