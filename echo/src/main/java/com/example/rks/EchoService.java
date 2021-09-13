package com.example.rks;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@RestController
public class EchoService {
    @GetMapping("/echo")
    public String echo(@RequestParam(value="echo", defaultValue = "Hello, World!") String echo) {
        return HtmlUtils.htmlEscape(echo);
    }

    @PostMapping("/echo")
    public String echoByPost(@RequestBody String echo) {
        return HtmlUtils.htmlEscape(echo);
    }
}
