package com.example.springdatajdbcdemo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;
@Data
@Table("task")
public class Task {
    @Id
    @Column("task_id")
    private Long taskId;
    private String title;
    private String text;
    private Boolean isComplete;
    private Date date;
    // Eagerly load associated categories
    @MappedCollection(idColumn = "category_id", keyColumn = "category_id")
    private List<Category> categories;
    @Column("user_id")
    private AppUser appuser;
}
