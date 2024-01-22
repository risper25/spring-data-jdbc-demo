package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category updateCategory(Category category);
    Category getCategoryById(long id);
    Category getCategoryByName(String name);
    List< Category> getAllCategories();

}
