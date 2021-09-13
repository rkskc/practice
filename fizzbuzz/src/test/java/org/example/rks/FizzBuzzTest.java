package org.example.rks;

import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzTest {
    @Autowired FizzBuzz fizzBuzz;

    @RegisterExtension
    static WireMockExtension wiremock = WireMockExtension.newInstance()
            .options(wireMockConfig()
                    .port(8080)
                    .extensions(new ResponseTemplateTransformer(true)))
            .build();

    @Test
    void samples() {
        wiremock.stubFor(post("/echo")
                .willReturn(aResponse().withBody("{{request.body}}")));

        assertEquals("Fizz", fizzBuzz.gets(3));
        assertEquals("4", fizzBuzz.gets(4));
        assertEquals("Buzz", fizzBuzz.gets(5));
        assertEquals("FizzBuzz", fizzBuzz.gets(15));
    }
}
