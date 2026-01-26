package com.person.dto;

import java.time.LocalDate;

public record PersonDto(
   Long id,
   String firstName,
   String lastName,
   String email,
   LocalDate birthDate
) {}
