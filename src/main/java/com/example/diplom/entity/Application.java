package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "application")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "status")
    private String status;
    @Column(name = "date_create")
    private Date date_create;
    @Column(name = "date_solution")
    private Date date_solution;
    @Column(name = "date_end")
    private Date date_end;
    @OneToOne(optional = false, mappedBy="id")
    @Column(name = "client_id")
    private Client client;
    @OneToOne(optional = false, mappedBy="key")
    @Column(name = "photos_client_one")
    private Photos photos_client_one;
    @OneToOne(optional = false, mappedBy="key")
    @Column(name = "photos_client_two")
    private Photos photos_client_two;
    @Column(name = "tariff")
    @OneToOne(optional = false, mappedBy="tariff_name")
    private Tariff tariff;
}
