package com.example.springdatajdbcdemo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.List;

public class Category {
    @Id
    private long category_id;
    private String category_name;
    @Column("task_id")
    private List<Task> tasks;
}
