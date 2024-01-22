package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.entities.Category;
import com.example.springdatajdbcdemo.services.CategoryService;
import com.example.springdatajdbcdemo.services.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryServiceImpl service;
    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        return ResponseEntity.ok(service.addCategory(category));
    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        return null;
    }


    public Category getCategoryById(long id) {
        return null;
    }


    public Category getCategoryByName(String name) {
        return null;
    }


    public List<Category> getAllCategories() {
        return null;
    }
}
