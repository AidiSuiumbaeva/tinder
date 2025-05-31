package org.example.services;

import org.example.models.Users;
import org.example.models.dto.UserCreateRequest;
import org.example.models.dto.UserResponse;
import org.example.models.enums.Gender;

import java.util.List;

public interface UserService {
    Users save(Users user);
    Users findByUsername(String username);
    String createUser(UserCreateRequest request);

    List<UserResponse> getByFilter(Gender gender, String city, Integer ageFrom, Integer ageTo);
}
