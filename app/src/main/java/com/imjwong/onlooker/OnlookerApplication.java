package com.imjwong.onlooker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlookerApplication {

    public static void main(String[] args) {

        System.out.println("application [ app ] starting...");

        SpringApplication.run(OnlookerApplication.class, args);
    }
}
