package com.example.OrbitalSync.repository;
import com.example.OrbitalSync.model.User;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Dakshitha", "dakshitha@gmail.com"));
        users.add(new User(2, "Priya", "priya@gmail.com"));
        users.add(new User(3, "Anu", "anu@gmail.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}
