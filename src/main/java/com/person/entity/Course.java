package com.person.entity;

import java.util.Set;

public class Course {

    private Long id;
    private String name;
    private String description;
    private Integer workload;
    private String instructor;
    private Set<Person> students;

}
