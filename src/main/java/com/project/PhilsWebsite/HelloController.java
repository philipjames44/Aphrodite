package com.project.PhilsWebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// from https://www.youtube.com/watch?v=ul1tJErDEkE
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello Morty, lets go, 20 min adventure, in and out.";
    }
}
