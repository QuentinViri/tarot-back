package com.example.tarotback.service;

import com.example.tarotback.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long userId);
}
