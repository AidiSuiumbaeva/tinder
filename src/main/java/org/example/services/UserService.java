package org.example.services;

import org.example.models.Users;
import org.example.models.dto.UserCreateRequest;

public interface UserService {
    Users save(Users user);
    Users findByUsername(String username);
    String createUser(UserCreateRequest request);

}
