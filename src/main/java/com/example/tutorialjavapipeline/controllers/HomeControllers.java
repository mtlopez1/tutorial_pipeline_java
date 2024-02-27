package com.example.tutorialjavapipeline.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomPerson;

@RestController
@RequestMapping("/")
public class HomeControllers {

    @GetMapping
    public String healthCheck() {
        return "ok";
    }

    @GetMapping("/people")
    public List<Person> getPeople() {
        return RandomPerson.get().listOf(20);
    }

}
