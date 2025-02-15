package org.example.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @GetMapping("/Hello")
    public String Hello(String name) {
        return "Hello" + name;
    }

}
