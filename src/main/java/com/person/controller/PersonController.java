package com.person.controller;

import com.person.dto.PersonDto;
import com.person.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping(value = "/people", params = {"page", "size"})
    public List<PersonDto> findAll(@RequestParam("page") int page, @RequestParam("size") int size) throws Exception {
        Page<PersonDto> resultPage = service.findPaginated(page, size);
        return resultPage.getContent();
    }
}
