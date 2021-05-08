package com.db.controller;

import com.db.model.User;
import com.db.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public String saveUser(@RequestBody User user) {
        return userRepo.save(user).toString();
    }

    @GetMapping
    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }
}
