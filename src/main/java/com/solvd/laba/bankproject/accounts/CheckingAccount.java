package com.solvd.laba.bankproject.accounts;

public class CheckingAccount extends Account {

    private double overdraftlimit;


    public CheckingAccount(String accountID, double balance, double amount) {
        super(accountID, balance, amount);
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

}


