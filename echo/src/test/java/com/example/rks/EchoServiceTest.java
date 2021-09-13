package com.example.rks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EchoServiceTest {
    @Autowired EchoService echoService;

    @Test
    public void echo() {
        assertEquals("test", echoService.echo("test"));
    }

    @Test
    public void sanitizesInput() {
        assertEquals("&lt;script&gt;alert(1)&lt;/script&gt;", echoService.echo("<script>alert(1)</script>"));
    }
}
