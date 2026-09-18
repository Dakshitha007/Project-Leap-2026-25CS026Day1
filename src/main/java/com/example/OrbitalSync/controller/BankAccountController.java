package com.example.OrbitalSync.controller;

import com.example.OrbitalSync.Service.BankAccountService;
import com.example.OrbitalSync.model.BankAccount;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {

    private BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    // GET all accounts
    @GetMapping
    public List<BankAccount> getAccounts() {
        return bankAccountService.getAccounts();
    }

    // GET account by ID
    @GetMapping("/{id}")
    public BankAccount getAccount(@PathVariable Integer id) {
        return bankAccountService.getAccountById(id);
    } 

    // POST
    @PostMapping
    public String addAccount(@RequestBody BankAccount account) {
        bankAccountService.addAccount(account);
        return "Account added successfully";
    }

    // PUT
    @PutMapping("/{id}")
    public String updateAccount(
            @PathVariable int id,
            @RequestBody BankAccount account) {

        boolean updated = bankAccountService.updateAccount(id, account);

        if (updated) {
            return "Account updated successfully";
        }

        return "Account not found";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable int id) {

        boolean deleted = bankAccountService.deleteAccount(id);

        if (deleted) {
            return "Account deleted successfully";
        }

        return "Account not found";
    }
}