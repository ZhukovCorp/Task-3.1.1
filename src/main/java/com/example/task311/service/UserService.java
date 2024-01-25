package com.example.task311.service;

import com.example.task311.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    User addUser(User user);

    void delete(User user);

    Optional<User> findById(int id);

    User editUser(User user);

    List<User> getAll();
}
