package com.example.rks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Tiny little application to do <code>echo</code> over HTTP and try out Gradle.
 */
@SpringBootApplication(scanBasePackages = "com.example.rks")
public class EchoApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EchoApp.class);
    }
}
