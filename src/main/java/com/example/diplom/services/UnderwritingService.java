package com.example.diplom.services;


import com.example.diplom.entity.Application;
import com.example.diplom.repositories.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UnderwritingService {

    private final ApplicationRepository applicationRepository;

    public List<Application> listApplications() {
        return applicationRepository.findAll();
    }

    public void changeStatusToApprove (UUID id) {
        for (Application creditApplication: applicationRepository.findAll()) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setState("APPROVE");
            }
        }
    }

    public void changeStatusToDecline (UUID id) {
        for (Application creditApplication: applicationRepository.findAll()) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setState("DECLINE");
            }
        }
    }

    public void changeStatusToCancel (UUID id) {
        for (Application creditApplication: applicationRepository.findAll()) {
            if (creditApplication.getId().equals(id)) {
                creditApplication.setState("CANCEL");
            }
        }
    }

}
