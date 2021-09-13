package org.example.rks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class EchoClient {
    @Autowired private RestTemplate restTemplate;

    private static final URI ECHO_LOCATION = URI.create("http://localhost:8080/echo");

    public String echo(Object input) {
        return restTemplate.postForObject(ECHO_LOCATION, input.toString(), String.class);
    }
}
