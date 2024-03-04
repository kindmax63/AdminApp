package com.example.diplom.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
/**kindmax63**/
@Data
public class Photos {
    private UUID id;
    private String name;
    private Long size;
    private String key;
    private LocalDate uploadDate;
//    private User user_id;
    private String user_id;
}
