package com.app.messaging_rabbitmq_dockerized;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> getAllObjects() {
        return service.getAllObjects();
    }

    @PostMapping
    public Person addObject(@RequestBody Person person) {
        return service.addPerson(person);
    }
}

