package com.solvd.laba.bankproject.loan;

import com.solvd.laba.bankproject.bank.BankName;

public class PersonalLoan extends BankName {



        private double balance;

        private double interestrate;

        public PersonalLoan(String name, double balance, double interestrate) {
            super(name);
            this.balance = balance;
            this.interestrate = interestrate;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getInterestrate() {
            return interestrate;
        }

        public void setInterestrate(double interestrate) {
            this.interestrate = interestrate;
        }

        public double calculateInterest() {
            double interest = balance * interestrate;
            System.out.println("Interest calculated: " + interest);
            return interest;
        }
    }



