package com.example.springdatajdbcdemo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Date;
import java.util.List;

public class Task {
    @Id
    private Long task_id;
    private String title;
    private String text;
    private Boolean isComplete;
    private Date date;
    @Column("category_id")
    private List<Category> categories;
    @Column("appUser_id")
    private AppUser user_;
}
