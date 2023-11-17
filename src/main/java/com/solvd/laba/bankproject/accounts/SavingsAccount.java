package com.solvd.laba.bankproject.accounts;

import com.solvd.laba.bankproject.TransactionLog;
import com.solvd.laba.bankproject.exceptions.AccountNotFoundException;
import com.solvd.laba.bankproject.exceptions.InsufficientFundException;
import com.solvd.laba.bankproject.exceptions.InvalidAmountException;
import com.solvd.laba.bankproject.exceptions.NegativeAmountException;
import com.solvd.laba.bankproject.person.Person;
import com.solvd.laba.bankproject.transactions.Payments;

public class SavingsAccount extends Account implements TransactionLog, Payments {

    private Person customer;
    protected double balance;

    public SavingsAccount(String accountID, double balance, double amount) {
        super(accountID, balance, amount);
    }



    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn amount" + amount);
        } else {
            System.out.println("Insufficient fund in account");
        }


    }

    @Override
    public void logTransaction() {
        System.out.println("Transaction Log for Account" + getAccountID());

    }

    @Override
    public void makePayment() {
        if (balance >= amount) {
            balance = balance - amount;
            String transactionDetails = "Payment of " + amount + ":" + customer;

            System.out.println("Payment of " + amount + "to" + transactionDetails);

        } else {
            System.out.println("Insuffucient amount for making payment" + getAccountID());
        }



    }






    public void performTransaction() throws InsufficientFundException, NegativeAmountException, AccountNotFoundException, InvalidAmountException {

        try {
            if (amount > balance) {
                throw new InsufficientFundException("Insufficient funds");

            }

        } catch (InsufficientFundException e) {
            System.out.println("Insufficient funds for withdrawal" + e.getMessage());
        }
        try {
            if (amount == -1) {
                throw new NegativeAmountException("Negative Amount");
            }

        } catch (NegativeAmountException e) {
            System.out.println("Negative amount " + e.getMessage());
        }
        try {
            if (amount < 1) {
                throw new InvalidAmountException("Invalid Amount");
            }

        } catch (InvalidAmountException e) {
            System.out.println("Invalid amount" + e.getMessage());
        }
        try {
            if (getBalance() <= 0) {
                throw new AccountNotFoundException("Invalid Account number");
            }
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}



