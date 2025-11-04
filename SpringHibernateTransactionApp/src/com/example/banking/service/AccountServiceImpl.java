package com.example.banking.service;

import com.example.banking.dao.AccountDAO;
import com.example.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Account from = accountDAO.getAccountById(fromId);
        Account to = accountDAO.getAccountById(toId);

        if (from.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance!");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDAO.updateAccount(from);
        accountDAO.updateAccount(to);

        System.out.println("Transfer Successful: " + amount + " from " + from.getName() + " to " + to.getName());
    }
}
