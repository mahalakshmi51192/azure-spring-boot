package com.example.azurespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringBootApplication.class, args);
    }

    @GetMapping("/message")
    public String hello() {
        return "Hello ! Welcome to Azure Spring Boot! Happy to see you !!";
    }
}
