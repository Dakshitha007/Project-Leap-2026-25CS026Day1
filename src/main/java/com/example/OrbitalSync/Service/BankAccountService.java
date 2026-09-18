package com.example.OrbitalSync.Service;

import com.example.OrbitalSync.model.BankAccount;
import com.example.OrbitalSync.repository.BankAccountRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    // GET
    public List<BankAccount> getAccounts() {
        return bankAccountRepository.findAll();
    }

    // GET by ID
    public BankAccount getAccountById(int id) {
        return bankAccountRepository.findById(id).orElse(null);
    }

    // POST
    public void addAccount(BankAccount account) {
        bankAccountRepository.save(account);
    }

    // PUT
    public boolean updateAccount(int id, BankAccount newAccount) {

        if (bankAccountRepository.existsById(id)) {
            newAccount.setId(id);
            bankAccountRepository.save(newAccount);
            return true;
        }

        return false;
    }

    // DELETE
    public boolean deleteAccount(int id) {

        if (bankAccountRepository.existsById(id)) {
            bankAccountRepository.deleteById(id);
            return true;
        }

        return false;
    }
}