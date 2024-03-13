package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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
    @Column(name = "state")
    private String state;
    @Column(name = "requested_amount")
    private BigDecimal requested_amount;
    @Column(name = "requested_period")
    private int requested_period;
    @Column(name = "approved_amount")
    private BigDecimal approved_amount;
    @Column(name = "approved_period")
    private int approved_period;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "period")
    private int period;
    @OneToOne(optional = false, mappedBy="id")
    @Column(name = "account_id")
    private BankAccount account_id;
    @OneToOne(optional = false, mappedBy="id")
    @Column(name = "offer_id")
    private Offer offer_id;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
    @OneToOne(optional = false, mappedBy="id")
    @Column(name = "employee_id")
    private Employee employee_id;
    @Column(name = "tariff_id")
    @OneToOne(optional = false, mappedBy="id")
    private Tariff tariff_id;
    @Column(name = "reject_reason")
    private String reject_reason;
    @Column(name = "approved_at")
    private Date approved_at;
    @OneToOne(optional = false, mappedBy="id")
    @Column(name = "client_id")
    private Client client;
}
