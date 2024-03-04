package com.example.diplom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
public class CreditApplication {
    private UUID id;
    private String status;
    private Date date_create;
    private Date date_solution;
    private Date date_end;
//    private User user_id;
   // private User user_login;
   // private Photos[] photos_user;
    private String user_id;
    private String user_login;
    private String photos_user;
}
