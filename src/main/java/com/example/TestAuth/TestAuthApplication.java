package com.example.TestAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class TestAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAuthApplication.class, args);
    }

}
