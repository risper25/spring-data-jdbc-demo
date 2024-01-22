package com.example.springdatajdbcdemo.controllers;

import com.example.springdatajdbcdemo.entities.AppUser;
import com.example.springdatajdbcdemo.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController  {
    private final UserServiceImpl service;
    @PostMapping("/add")
    public ResponseEntity<AppUser> addUser(@RequestBody AppUser user) {
        return ResponseEntity.ok(service.addUser(user));
    }

    @PutMapping("/update")
    public ResponseEntity<AppUser> updateUser(@RequestBody AppUser user) {
        return ResponseEntity.ok(service.updateUser(user));
    }

    @GetMapping("/find-user-id/{id}")
    public ResponseEntity<AppUser> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @GetMapping("/find-user-email/{email}")
    public ResponseEntity<AppUser> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.getUserByEmail(email));
    }

    @GetMapping("findAllUsers")
    public ResponseEntity<List<AppUser>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @DeleteMapping("/delete-user-id/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
        service.deleteUserById(id);

        return ResponseEntity.ok("deleted");

    }
}
