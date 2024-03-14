package com.example.diplom.services;


import com.example.diplom.entity.Application;
import com.example.diplom.entity.Client;
import com.example.diplom.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    public void createClient (Client client) {
        clientRepository.save(client);
    }

}
