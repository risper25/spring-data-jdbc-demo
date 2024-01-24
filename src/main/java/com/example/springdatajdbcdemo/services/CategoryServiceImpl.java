package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.Category;
import com.example.springdatajdbcdemo.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;
    @Override
    public Category addCategory(Category category) {

        return categoryRepository.save(category) ;
    }

    @Override
    @Transactional
    public Category updateCategory(Category category) {
        Category existingCategory=categoryRepository.findByCategoryId(category.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        existingCategory.setCategoryName(category.getCategoryName());

        return existingCategory;
    }

    @Override
    public Category getCategoryById(long id) {

        return categoryRepository.findByCategoryId(id).get();
    }

    @Override
    public Category getCategoryByName(String name) {

        return categoryRepository.findByCategoryName(name).get();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
