package com.lucianodev.course.config;

import com.lucianodev.course.entities.User;
import com.lucianodev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@email.com", "98812345", "123456");
        User user2 = new User(null, "Alex Green", "alex@email.com", "439812235", "345612");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
