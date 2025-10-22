package com.example.backendapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class TestController {

    // Simple text output
    @GetMapping("/test")
    public String testText() {
        return "Hello! Your Spring Boot backend is working.";
    }

    // Simple JSON output
    @GetMapping("/test/json")
    public Map<String, Object> testJson() {
        return Map.of(
                "status", "OK",
                "message", "This is a JSON test endpoint",
                "timestamp", System.currentTimeMillis()
        );
    }
}
