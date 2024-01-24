package com.example.springdatajdbcdemo.services;

import com.example.springdatajdbcdemo.entities.AppUser;
import com.example.springdatajdbcdemo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public AppUser addUser(AppUser user) {

        return userRepository.save(user);
    }

    @Override
    @Transactional
    public AppUser updateUser(AppUser updatedUser) {
     AppUser  existingUser=userRepository.findById(updatedUser.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
     existingUser.setEmail(updatedUser.getEmail());
     existingUser.setFirstName(updatedUser.getFirstName());

        return userRepository.save(existingUser);
    }

    @Override
    public AppUser getUserById(Long id) {
        return userRepository.findByUserId(id).get();
    }

    @Override
    public AppUser getUserByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteByUserId(id);;

    }
}
