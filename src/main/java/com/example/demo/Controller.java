package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public login page so it will be accessible to everyone";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "This is a private page so  You need to be authenticated.";
    }
}
