package com.person.entity;

import java.time.LocalDateTime;

public class UserAccount {

    private Long id;
    private String username;
    private String passwordHash;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    private Person person;

}
