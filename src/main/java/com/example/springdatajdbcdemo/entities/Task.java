package com.example.springdatajdbcdemo.entities;

import java.util.Date;

public class Task {
    private Long task_id;
    private String title;
    private String text;
    private Boolean isComplete;
    private Date date;
    private Category category;
}
