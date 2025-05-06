package com.max.saip.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AIController {

    @CrossOrigin
    @RequestMapping(value = "/ai/generateStreamAsString", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public String generateStreamAsString(@RequestParam(value = "message", defaultValue = "讲个笑话") String message) {
        return null;
    }
}
