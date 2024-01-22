package com.example.springdatajdbcdemo.repositories;

import com.example.springdatajdbcdemo.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
    Optional<Category> findByCategory_id(Long category_id);
    Optional<Category> findByCategory_name(Long category_name);
}
