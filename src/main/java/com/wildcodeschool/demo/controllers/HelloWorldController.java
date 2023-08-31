package com.wildcodeschool.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengersAssemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        List<String> cities = Arrays.asList("Paris", "Bordeaux", "Lyon");
        return cities.toString();
    }
}