package com.example.springdatajdbcdemo.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Table("appuser")
@RequiredArgsConstructor
public class AppUser {
    @Id
    @Column("user_id")
    private Long userId;
    private String firstName;
    private String email;



}
