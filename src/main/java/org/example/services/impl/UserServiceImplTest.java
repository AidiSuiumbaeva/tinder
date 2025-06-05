package org.example.services.impl;

import org.example.models.Users;
import org.example.models.dto.UserCreateRequest;
import org.example.models.dto.UserResponse;
import org.example.models.enums.Gender;
import org.example.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImplTest implements UserService {
    @Override
    public Users save(Users user) {
        return null;
    }

    @Override
    public Users findByUsername(String username) {
        return null;
    }

    @Override
    public String createUser(UserCreateRequest request) {
        return "";
    }

    @Override
    public List<UserResponse> getByFilter(Gender gender, String city, Integer ageFrom, Integer ageTo) {
        return List.of();
    }
}
