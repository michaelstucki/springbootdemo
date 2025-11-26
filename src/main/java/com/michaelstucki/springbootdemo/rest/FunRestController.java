package com.michaelstucki.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello() { return "Hello World...!"; }

    @GetMapping("/workout")
    public String workout() { return "Run a hard 5K!"; }

    // Inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    String teamInfo() { return "Coach: " + coachName + ", Team: " + teamName; }
}
