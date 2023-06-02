package com.jmd.swe645.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String index() {
        return "Greetings from Spring Boot hosted on Tomcat!";
    }

}