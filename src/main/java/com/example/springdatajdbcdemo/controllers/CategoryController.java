package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.controllers.dtos.CategoryDto;
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
    public ResponseEntity<Category> addCategory(@RequestBody CategoryDto request) {
        Category category=new Category();
        category.setCategoryName(request.name());
        return ResponseEntity.ok(service.addCategory(category));
    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {

        return ResponseEntity.ok(service.updateCategory(category));
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable long id) {

        return ResponseEntity.ok(service.getCategoryById(id));
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<Category> getCategoryByName(@PathVariable String name) {

        return ResponseEntity.ok(service.getCategoryByName(name));
    }

    @GetMapping("/findAll")
    public List<Category> getAllCategories() {

        return service.getAllCategories();
    }
}
