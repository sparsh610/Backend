package org.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartingPoint {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(StartingPoint.class);
    }
}