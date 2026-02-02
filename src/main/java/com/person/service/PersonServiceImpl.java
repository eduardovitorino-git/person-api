package com.person.service;

import com.person.dto.PersonDto;
import com.person.dto.PersonWithPhonesDto;
import com.person.entity.Person;
import com.person.exception.PersonNotFoundException;
import com.person.repository.PersonRepository;
import com.person.utils.PersonMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Page<PersonDto> findPaginated(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Person> pagePerson = repo.findAll(pageable);
        if(pagePerson.isEmpty()) throw new PersonNotFoundException("Resource not found");
        return pagePerson.map(mapper::toDto);
    }

    // TODO: Consulta com N+1. Exemplo para poder corrigir
    @Override
    @Transactional(readOnly = true)
    public List<PersonWithPhonesDto> findAllWithPhones() {
        List<Person> people = repo.findAll();
        return people.stream()
                .map(mapper::toPersonWithPhonesDto)
                .toList();
    }
}
