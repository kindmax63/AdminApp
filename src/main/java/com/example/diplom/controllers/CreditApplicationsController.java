package com.example.diplom.controllers;

import com.example.diplom.entity.CreditApplication;
import com.example.diplom.services.CreditApplicationService;
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
public class CreditApplicationsController {

    private final CreditApplicationService creditApplicationService;

    @GetMapping ("/")
    public String creditApplications(Model model){
        model.addAttribute("creditApplications", creditApplicationService.listNewCreditApplications());
        return "page-credit-applications";
    }


    @PostMapping ("/credit_application/change_status_approve/{id}")
    public String changeStatusCreditApplicationToApprove (@PathVariable UUID id){
        creditApplicationService.changeStatusToApprove(id);
        return "redirect:/";
    }

    @PostMapping ("/credit_application/change_status_decline/{id}")
    public String changeStatusCreditApplicationToDecline (@PathVariable UUID id){
        creditApplicationService.changeStatusToDecline(id);
        return "redirect:/";
    }

    @PostMapping ("/credit_application/change_status_incorrect/{id}")
    public String changeStatusCreditApplicationToIncorrect (@PathVariable UUID id){
        creditApplicationService.changeStatusToIncorrectPhotos (id);
        return "redirect:/";
    }

    @GetMapping ("/credit_application/{photos_user}")
    public String photosUser (UUID id){
        return "";
    }


}
