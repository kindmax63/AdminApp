package com.example.diplom.repositories;

import com.example.diplom.entity.Client;
import com.example.diplom.entity.CreditApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository <Client, UUID> {
}