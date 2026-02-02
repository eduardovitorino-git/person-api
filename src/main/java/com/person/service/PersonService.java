package com.person.service;

import com.person.dto.PersonDto;
import com.person.dto.PersonWithPhonesDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PersonService {

    List<PersonDto> findAll();

    Page<PersonDto> findPaginated(int page, int size);

    public List<PersonWithPhonesDto> findAllWithPhones();

}