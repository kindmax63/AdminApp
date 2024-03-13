package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "photos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "name_file")
    private String name_file;
    @Column(name = "size")
    private Long size;
    @Column(name = "key")
    private String key;
    @Column(name = "uploadDate")
    private LocalDate uploadDate;
    @Column(name = "client_id")
    @OneToOne(optional = false, mappedBy="id")
    private Client client_id;
}
