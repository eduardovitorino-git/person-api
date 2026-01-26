package com.person.service;

import com.person.dto.PersonDto;
import com.person.entity.Person;
import com.person.repository.PersonRepository;
import com.person.utils.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository repo;
    private final PersonMapper mapper;

    public PersonServiceImpl(PersonRepository repo, PersonMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<PersonDto> findAll() {
        return repo.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }
}
