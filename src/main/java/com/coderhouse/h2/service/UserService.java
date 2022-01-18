package com.coderhouse.h2.service;

import com.coderhouse.h2.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    User updateUserById(User user, Long id);
    void delete(User user, Long id);
    User findByName(String name);
    List<User> findByAgeGreaterThan(int age);
    List<User> findAll();

}
