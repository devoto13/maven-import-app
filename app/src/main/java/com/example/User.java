package com.example;

import javax.persistence.*;

@Entity
@Table(name = "user_")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 256, unique = true)
    public String email;

    @Column(nullable = false, length = 256)
    public String fullName;
}
