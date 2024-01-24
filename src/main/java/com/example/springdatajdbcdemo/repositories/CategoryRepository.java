package com.example.springdatajdbcdemo.repositories;

import com.example.springdatajdbcdemo.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
    Optional<Category> findByCategoryId(Long categoryId);
    Optional<Category> findByCategoryName(String categoryName);
    List<Category> findAll();
}
