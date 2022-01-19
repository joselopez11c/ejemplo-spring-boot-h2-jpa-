package com.coderhouse.h2.controller;

import com.coderhouse.h2.model.User;
import com.coderhouse.h2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coder-house")
public class UserController {

    private final UserService service;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/user/all")
    public List<User> findUsers() {
        return service.findAll();
    }

    @GetMapping("/user")
    public User findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @PutMapping("/user/{id}")
    public User updateUserById(@PathVariable Long id, @RequestBody  User user) {
        return service.updateUserById(user, id);
    }

}
