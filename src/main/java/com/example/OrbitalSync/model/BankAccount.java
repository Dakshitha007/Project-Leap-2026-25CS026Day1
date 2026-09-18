package com.example.OrbitalSync.model;

import jakarta.persistence.Entity;
/*import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;*/
import jakarta.persistence.Id;

@Entity
public class BankAccount {

    @Id
    private int id;

    private String accountNumber;
    private String name;
    private double balance;

    // Default constructor
    public BankAccount() {
    }

    // Parameterized constructor
    public BankAccount(int id, String accountNumber, String name, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}