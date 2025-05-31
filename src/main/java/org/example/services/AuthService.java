package org.example.services;

import org.example.models.dto.AuthRequest;

public interface AuthService {
    String login(AuthRequest request);
}
