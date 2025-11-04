package com.example.banking.dao;

import com.example.banking.entity.Account;

public interface AccountDAO {
    Account getAccountById(int id);
    void updateAccount(Account account);
}
