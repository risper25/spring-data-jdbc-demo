package com.example.springdatajdbcdemo.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.List;

@Data
@RequiredArgsConstructor
public class AppUser {
    @Id
    private Long user_id;
    private String firstName;
    private String email;
   @Column("appUser_id")
   private List<Task> tasks;


}
