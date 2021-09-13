package org.example.rks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * arbitrarily makes a call to an external service so I can test wiremock
 */
@Service
public class FizzBuzz {
    @Autowired EchoClient echo;

    private static final Map<Integer, String> map = Map.ofEntries(
            Map.entry(3, "Fizz"),
            Map.entry(5, "Buzz")
    );

    public String gets(int i) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (i % entry.getKey() == 0)
                sb.append(entry.getValue());
        }
        return sb.length() > 0 ? sb.toString() : echo.echo(i);
    }
}
