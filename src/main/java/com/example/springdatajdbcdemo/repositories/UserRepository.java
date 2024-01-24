package com.example.springdatajdbcdemo.repositories;

import com.example.springdatajdbcdemo.entities.AppUser;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<AppUser,Long> {
    Optional<AppUser> findByUserId(Long userId);
    Optional<AppUser> findByEmail(String email);
    List<AppUser> findAll();

    void deleteByUserId(Long userId);







}
