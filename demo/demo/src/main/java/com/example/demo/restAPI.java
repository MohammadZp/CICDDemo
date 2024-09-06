package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class restAPI {

    private final Config config;

    public restAPI(Config config) {
        this.config = config;
    }

    @GetMapping("test")
    public String showEnv() {
        return "Hello Guys!!" + config.getApiToken();
    }
}
