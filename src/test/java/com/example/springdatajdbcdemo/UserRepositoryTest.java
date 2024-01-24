package com.example.springdatajdbcdemo;

import com.example.springdatajdbcdemo.entities.AppUser;
import com.example.springdatajdbcdemo.repositories.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@DataJdbcTest
@DirtiesContext
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSavedUser() {
        // Given
        AppUser user = new AppUser();
        user.setFirstName("Risper");
        user.setEmail("r@gmail.com");

        // When
        userRepository.save(user);

        // Then
        AppUser savedUser = userRepository.findByEmail("r@gmail.com").orElse(null);
        Assertions.assertNotNull(savedUser);
        Assertions.assertEquals("Risper", savedUser.getFirstName());
    }
}