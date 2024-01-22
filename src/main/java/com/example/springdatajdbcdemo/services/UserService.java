package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.AppUser;

import java.util.List;

public interface UserService {
    AppUser addUser(AppUser user);
    AppUser updateUser(AppUser user);
    AppUser getUserById(Long id);
    AppUser getUserByEmail(String email);
    List<AppUser> getAllUsers();
    void deleteUserById(Long id);
}
