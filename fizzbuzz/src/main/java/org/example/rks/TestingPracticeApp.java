package org.example.rks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "org.example.rks")
public class TestingPracticeApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TestingPracticeApp.class);

        FizzBuzz fizzBuzz = ctx.getBean(FizzBuzz.class);
        for(int i = 1; i <= 40; i++) {
            System.out.println(fizzBuzz.gets(i));
        }

        System.exit(0);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }
}
