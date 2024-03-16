package com.example.diplom.controllers;

import com.example.diplom.services.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class PhotosController {

    private final PhotoService photoService;

    @GetMapping("/photos")
    public String photos(Model model){
        model.addAttribute("photos", photoService.listPhotos());
        return "page-photos";
    }

    @PostMapping("/photos/change_status_approve/{id}")
    public String changeStatusPhotosToApprove (@PathVariable UUID id){
        photoService.changeStatusToApprove(id);
        return "redirect:/photos";
    }
    @PostMapping ("/photos/change_status_decline/{id}")
    public String changeStatusPhotosToDecline (@PathVariable UUID id){
        photoService.changeStatusToDecline(id);
        return "redirect:/photos";
    }


}
