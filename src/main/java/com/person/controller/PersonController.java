package com.person.controller;

import com.person.dto.PersonDto;
import com.person.dto.PersonWithPhonesDto;
import com.person.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping(value = "/people", params = {"page", "size"})
    public Page<PersonDto> findAll(@RequestParam("page") int page, @RequestParam("size") int size) throws Exception {
        return service.findPaginated(page, size);
    }

    @GetMapping("/people/with-phones")
    public List<PersonWithPhonesDto> findAllWithPhones() {
        return service.findAllWithPhones();
    }
}
