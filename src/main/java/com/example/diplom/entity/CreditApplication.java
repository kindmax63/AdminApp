package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.UUID;
import com.example.diplom.entity.Client;
import com.example.diplom.entity.Photos;

@Entity
@Table(name = "credit_apllication")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditApplication {
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
}
