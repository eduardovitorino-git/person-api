package com.person.dto;

public record PhoneDto(
        Long id,
        String areaCode,
        String number,
        String type
) {}
