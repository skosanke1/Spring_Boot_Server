package com.server.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // GET HTTP Method
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}