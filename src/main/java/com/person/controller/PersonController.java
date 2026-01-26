package com.person.controller;

import com.person.dto.PersonDto;
import com.person.entity.Person;
import com.person.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/people")
    public List<PersonDto> findAll() {
        return service.findAll();
    }
}
