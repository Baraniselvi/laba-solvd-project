package com.solvd.laba.bankproject.accounts;

import com.solvd.laba.bankproject.person.Person;

public class Account {

    private String accountID;

    private double balance;

    protected double amount;

    public static final double minimumBalance = 0.0;

    public Account(String accountID, double balance, double amount) {
        this.accountID = accountID;
        this.balance = balance;
        this.amount = amount;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}



