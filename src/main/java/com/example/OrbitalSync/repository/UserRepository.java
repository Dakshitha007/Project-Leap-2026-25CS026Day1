package com.example.OrbitalSync.repository;

import com.example.OrbitalSync.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}