package com.example.banking.service;

public interface AccountService {
    void transferMoney(int fromId, int toId, double amount);
}
