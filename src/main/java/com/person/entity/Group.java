package com.person.entity;

import java.time.LocalDateTime;
import java.util.Set;

public class Group {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Set<Person> members;

}
