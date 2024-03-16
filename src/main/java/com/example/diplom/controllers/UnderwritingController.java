package com.example.diplom.controllers;


import com.example.diplom.entity.Application;
import com.example.diplom.services.ApplicationService;
import com.example.diplom.services.UnderwritingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class UnderwritingController {

    private final UnderwritingService underwritingService;

    @GetMapping("/underwriting")
    public String applications(Model model){
        model.addAttribute("applications", underwritingService.listApplications());
        return "page-underwriting";
    }

    @PostMapping ("/underwriting/change_status_approve/{id}")
    public String changeStatusApplicationToApprove (@PathVariable UUID id){
        underwritingService.changeStatusToApprove(id);
        return "redirect:/underwriting";
    }
    @PostMapping ("/underwriting/change_status_decline/{id}")
    public String changeStatusApplicationToDecline (@PathVariable UUID id){
        underwritingService.changeStatusToDecline(id);
        return "redirect:/underwriting";
    }
    @PostMapping ("/underwriting/change_status_cancel/{id}")
    public String changeStatusApplicationToIncorrect (@PathVariable UUID id){
        underwritingService.changeStatusToCancel(id);
        return "redirect:/underwriting";
    }

}
