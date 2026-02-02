package com.person.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    
//    // One-to-One candidates
//    private Document document;
//    private Address address;
//    private UserAccount userAccount;

//    // One-to-Many candidates
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>();
//    private List<BankAccount> bankAccounts;
//    private List<Vehicle> vehicles;
//    private List<Pet> pets;

//    // Many-to-Many candidates
//    private Set<Course> courses;
//    private Set<Project> projects;
//    private Set<Skill> skills;
//    private Set<Group> groups;

}
