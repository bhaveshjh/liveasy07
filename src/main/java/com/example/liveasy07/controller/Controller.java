package com.example.liveasy07.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String demo(){
        return "Hello Everyone";
    }
}
