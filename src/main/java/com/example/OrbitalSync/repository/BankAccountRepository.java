package com.example.OrbitalSync.repository;

import com.example.OrbitalSync.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
}