package com.example.banking.dao;

import com.example.banking.entity.Account;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Account getAccountById(int id) {
        return sessionFactory.getCurrentSession().get(Account.class, id);
    }

    @Override
    public void updateAccount(Account account) {
        sessionFactory.getCurrentSession().update(account);
    }
}
