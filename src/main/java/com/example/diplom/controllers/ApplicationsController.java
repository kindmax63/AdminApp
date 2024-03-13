package com.example.diplom.controllers;

import com.example.diplom.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.UUID;
/**kindmax63**/
@Controller
@RequiredArgsConstructor
public class ApplicationsController {

    private final ApplicationService applicationService;
    @GetMapping ("/")
    public String applications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "page-applications";
    }

    @PostMapping ("/application/change_status_approve/{id}")
    public String changeStatusApplicationToApprove (@PathVariable UUID id){
        applicationService.changeStatusToApprove(id);
        return "redirect:/";
    }
    @PostMapping ("/application/change_status_decline/{id}")
    public String changeStatusApplicationToDecline (@PathVariable UUID id){
        applicationService.changeStatusToDecline(id);
        return "redirect:/";
    }
    @PostMapping ("/application/change_status_incorrect/{id}")
    public String changeStatusApplicationToIncorrect (@PathVariable UUID id){
        applicationService.changeStatusToIncorrectPhotos (id);
        return "redirect:/";
    }

    @GetMapping ("/application/{photos_user}")
    public String photosUser (UUID id){
        return "";
    }


}
