package com.solvd.laba.bankproject.person;
import com.solvd.laba.bankproject.Transaction;
import com.solvd.laba.bankproject.accounts.Account;
import com.solvd.laba.bankproject.loan.PersonalLoan;

import java.util.ArrayList;
import java.util.Objects;

public class Customer extends Person{
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    protected PersonalLoan personalLoan;

    public Customer(String firstname, String lastname, ArrayList<Account> accounts, ArrayList<Transaction> transactions) {
        super(firstname, lastname);
        this.accounts = accounts;
        this.transactions = transactions;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String getFullNAME() {
        return firstname + lastname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", transactions=" + transactions +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(accounts, customer.accounts) && Objects.equals(transactions, customer.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accounts, transactions);
    }
}


