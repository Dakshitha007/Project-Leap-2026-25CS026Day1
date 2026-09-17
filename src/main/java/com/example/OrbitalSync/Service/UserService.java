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

    public User getUserById(int id) {

        for (User user : userRepository.getAllUsers()) {

            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    public void addUser(User user) {
        userRepository.getAllUsers().add(user);
    }

    public boolean updateUser(int id, User newUser) {

        List<User> users = userRepository.getAllUsers();

        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getId() == id) {

                users.set(i, newUser);
                return true;
            }
        }

        return false;
    }

    public boolean deleteUser(int id) {

        List<User> users = userRepository.getAllUsers();

        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getId() == id) {

                users.remove(i);
                return true;
            }
        }

        return false;
    }
}
