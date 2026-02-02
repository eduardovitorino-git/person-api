package com.person.dto;

import java.util.List;

public record PersonWithPhonesDto(
        Long id,
        String firstName,
        String lastName,
        List<PhoneDto> phones
) {}
