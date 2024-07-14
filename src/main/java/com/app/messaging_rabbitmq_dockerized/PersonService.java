package com.app.messaging_rabbitmq_dockerized;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repository;
    public List<Person> getAllObjects() {
        return repository.findAll();
    }
    public Person addPerson(Person person) {
        return repository.save(person);
    }
}
