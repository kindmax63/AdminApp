package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "date_create")
    private Date date_create;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role_id;
}
