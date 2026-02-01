package com.person.service;

import com.person.dto.PersonDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PersonService {


    List<PersonDto> findAll();
    Page<PersonDto> findPaginated(int page, int size);


}