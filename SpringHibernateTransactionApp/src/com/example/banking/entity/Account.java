package com.example.banking.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private double balance;

    public Account() {}
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
