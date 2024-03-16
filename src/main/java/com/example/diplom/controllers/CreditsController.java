package com.example.diplom.controllers;


import com.example.diplom.services.ClientService;
import com.example.diplom.services.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CreditsController {

    private final CreditService creditService;

    @GetMapping("/credits")
    public String credits(Model model){
        model.addAttribute("credits", creditService.listCredits());
        return "page-credits";
    }
}
