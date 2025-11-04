package com.example.banking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int fromAccountId;

    @Column
    private int toAccountId;

    @Column
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Transaction() {}

    public Transaction(int fromAccountId, int toAccountId, double amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
        this.date = new Date();
    }
}
