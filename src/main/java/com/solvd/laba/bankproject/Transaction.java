package com.solvd.laba.bankproject;

import java.util.Date;



public class Transaction {
    private double balance;

    public Transaction(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void checkbalance()
    {
        System.out.println("Current Balance " +getBalance());
    }
}
