package com.person.service;

import com.person.dto.PersonDto;
import com.person.entity.Person;

import java.util.List;

public interface PersonService {


    List<PersonDto> findAll();

}
