package com.example.diplom.controllers;

import com.example.diplom.entity.Client;
import com.example.diplom.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ClientsController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public String clients(Model model){
        model.addAttribute("clients", clientService.listClients());
        return "page-clients";
    }

  /*  @PostMapping("/client/create")
    public String createClient (Client client){
        clientService.createClient(client);
        return "redirect:/clients";
    }*/


}
