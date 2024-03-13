package com.example.diplom.services;

import com.example.diplom.entity.CreditApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**kindmax63**/
@Service
public class CreditApplicationService {


    public List<CreditApplication> listNewCreditApplications() {
        return creditApplications;
    }

    public void changeStatusToApprove (UUID id) {
        for (CreditApplication creditApplication: creditApplications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("APPROVE");
            }
        }
    }

    public void changeStatusToDecline (UUID id) {
        for (CreditApplication creditApplication: creditApplications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("DECLINE");
            }
        }
    }

    public void changeStatusToIncorrectPhotos (UUID id) {
        for (CreditApplication creditApplication: creditApplications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("INCORRECT_PHOTOS");
            }
        }
    }

    public CreditApplication getCreditApplicationById (UUID id){
        for (CreditApplication creditApplication: creditApplications){
            if (creditApplication.getId().equals(id)){
                return creditApplication;
            }
        }
      return null;
    }

}
