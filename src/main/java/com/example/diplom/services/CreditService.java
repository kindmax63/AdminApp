package com.example.diplom.services;


import com.example.diplom.entity.Client;
import com.example.diplom.entity.Credit;
import com.example.diplom.repositories.ClientRepository;
import com.example.diplom.repositories.CreditRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditService {

    private final CreditRepository creditRepository;

    public List<Credit> listCredits() {
        return creditRepository.findAll();
    }

}
