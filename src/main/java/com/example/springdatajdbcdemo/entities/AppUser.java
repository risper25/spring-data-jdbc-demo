package com.example.springdatajdbcdemo.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class AppUser {
    private Long user_id;
    private String firstName;
    private String email;
    private List<TaskGroup> taskGroupList;


}
