package com.person.utils;

import com.person.dto.PersonDto;
import com.person.dto.PersonWithPhonesDto;
import com.person.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person toEntity(PersonDto expenseDto);
    PersonDto toDto(Person person);
    PersonWithPhonesDto toPersonWithPhonesDto(Person person);
}

