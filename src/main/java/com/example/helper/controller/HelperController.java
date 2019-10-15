package com.example.helper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {

    @GetMapping("/message")
    public String helloMessage() {
        return "Hello, this is version-1";
    }
}
