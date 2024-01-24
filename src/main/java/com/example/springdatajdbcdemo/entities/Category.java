package com.example.springdatajdbcdemo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
@Data
@Table("category")
public class Category{
    @Id
    @Column("category_id")
    private long categoryId;
    @Column("category_name")
    private String categoryName;


}
