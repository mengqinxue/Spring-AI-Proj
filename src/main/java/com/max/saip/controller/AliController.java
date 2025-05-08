package com.max.saip.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


@RestController
@RequestMapping("/api/ollama")
public class AliController {
    @CrossOrigin
    @GetMapping(value = "/chat", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public String chat(@RequestParam String message) {
        String encodedMessage = URLEncoder.encode(message, StandardCharsets.UTF_8);
//        return chatClient.prompt(encodedMessage).call().content();
        return encodedMessage;
    }
}
