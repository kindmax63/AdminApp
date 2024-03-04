package com.example.diplom.entity;

import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
public class User {
    private UUID id;
    private Date date_create;
    private String login;
    private String first_name;
    private String middle_name;
    private String second_name;
    private Date date_birtday;
    private String passport_series;
    private String passport_number;
    private String passport_who_issued;
    private String passport_when_issued;
    private String registration_address;
    private String email_address;
    private String mobile_number;
 //   private Photos[] photos_user;
    private String photos_user;
}
