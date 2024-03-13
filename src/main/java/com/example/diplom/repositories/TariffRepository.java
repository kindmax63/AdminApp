package com.example.diplom.repositories;

import com.example.diplom.entity.Tariff;
import com.example.diplom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TariffRepository extends JpaRepository<Tariff, UUID> {
}
