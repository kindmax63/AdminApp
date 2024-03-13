package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "date_create")
    private Date date_create;
    @Column(name = "login")
    private String login;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "middle_name")
    private String middle_name;
    @Column(name = "second_name")
    private String second_name;
    @Column(name = "date_birtday")
    private Date date_birtday;
    @Column(name = "passport_series")
    private String passport_series;
    @Column(name = "passport_number")
    private String passport_number;
    @Column(name = "passport_who_issued")
    private String passport_who_issued;
    @Column(name = "passport_when_issued")
    private String passport_when_issued;
    @Column(name = "registration_address")
    private String registration_address;
    @Column(name = "email_address")
    private String email_address;
    @Column(name = "mobile_number")
    private String mobile_number;
    @Column(name = "tariff")
    @OneToOne(optional = false, mappedBy="tariff_name")
    private Tariff tariff;
    @Column(name = "photo_client_key_one")
    @OneToOne(optional = false, mappedBy="key")
    private Photos photo_client_key_one;
    @Column(name = "photo_client_key_two")
    @OneToOne(optional = false, mappedBy="key")
    private Photos photo_client_key_two;
}
