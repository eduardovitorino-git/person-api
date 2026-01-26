package com.person.entity;

import java.time.LocalDate;
import java.util.Set;

public class Project {

    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private Set<Person> members;

}
