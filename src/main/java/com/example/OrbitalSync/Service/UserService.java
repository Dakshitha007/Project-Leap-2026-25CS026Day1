package com.example.OrbitalSync.Service;

import com.example.OrbitalSync.model.User;
import com.example.OrbitalSync.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public boolean updateUser(int id, User newUser) {

        if (userRepository.existsById(id)) {
            newUser.setId(id);
            userRepository.save(newUser);
            return true;
        }

        return false;
    }

    public boolean deleteUser(int id) {

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }

        return false;
    }
}