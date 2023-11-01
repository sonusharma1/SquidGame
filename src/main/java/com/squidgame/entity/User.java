package com.squidgame.entity;

import jakarta.persistence.Entity;

@Entity
public class User {
    private Integer id;
    private String userName;
    private String userPassword;
}
