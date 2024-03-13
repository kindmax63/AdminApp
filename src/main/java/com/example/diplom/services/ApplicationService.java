package com.example.diplom.services;

import com.example.diplom.entity.Application;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
/**kindmax63**/
@Service
public class ApplicationService {

    public List<Application> listNewApplications() {
        return null;
    }

    public void changeStatusToApprove (UUID id) {
       /* for (Application creditApplication: applications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("APPROVE");
            }
        }*/
    }

    public void changeStatusToDecline (UUID id) {
        /*for (Application creditApplication: applications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("DECLINE");
            }
        }*/
    }

    public void changeStatusToIncorrectPhotos (UUID id) {
        /*for (Application creditApplication: applications) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setStatus("INCORRECT_PHOTOS");
            }
        }*/
    }

    public Application getApplicationById (UUID id){

      return null;
    }

}
