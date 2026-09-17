package com.example.OrbitalSync.controller;


import com.example.OrbitalSync.model.User;
import com.example.OrbitalSync.Service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {

        return userService.getUserById(id);
    }

    @PostMapping
    public String addUser(@RequestBody User user) {

        userService.addUser(user);

        return "User added successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(
            @PathVariable int id,
            @RequestBody User user) {

        boolean updated = userService.updateUser(id, user);

        if (updated) {
            return "User updated successfully";
        }

        return "User not found";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {

        boolean deleted = userService.deleteUser(id);

        if (deleted) {
            return "User deleted successfully";
        }

        return "User not found";
    }
}
