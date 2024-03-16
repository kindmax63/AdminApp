package com.example.diplom.controllers;

import com.example.diplom.entity.Application;
import com.example.diplom.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ApplicationsController {

    private final ApplicationService applicationService;
    @GetMapping ("/")
    public String applications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "page-applications";
    }


   /* @GetMapping ("/application/{photos_user}")
    public String photosUser (UUID id){
        return "";
    }*/


}
