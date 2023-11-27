package com.solvd.laba.bankproject;

import com.solvd.laba.bankproject.accounts.CheckingAccount;
import com.solvd.laba.bankproject.accounts.SavingsAccount;
import com.solvd.laba.bankproject.bank.BankName;
import com.solvd.laba.bankproject.exceptions.AccountNotFoundException;
import com.solvd.laba.bankproject.exceptions.InsufficientFundException;
import com.solvd.laba.bankproject.exceptions.InvalidAmountException;
import com.solvd.laba.bankproject.exceptions.NegativeAmountException;
import com.solvd.laba.bankproject.loan.PersonalLoan;
import com.solvd.laba.bankproject.person.Customer;
import com.solvd.laba.bankproject.person.Employee;
import com.solvd.laba.bankproject.person.Person;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.util.ArrayList;

public class Main {
    private static final Logger logger =LogManager.getLogger(Main.class);git


    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.info("Bank Project");


        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<BankName> bankNames = new ArrayList<BankName>();
        ArrayList<Employee> employee = new ArrayList<Employee>();
        ArrayList<Location> locations = new ArrayList<Location>();






        Transaction transaction = new Transaction(233344);
        transaction.checkbalance();

        Location location = new Location(" Dallas "," USA "," 93833373773 ");
        logger.info(location.getLocationInfo());




        CheckingAccount checkingAccount = new CheckingAccount("12333", 34444, 500);
        checkingAccount.getOverdraftlimit();
        Location location1 = new Location(" Neenah ", " USA ", " 929393399 ");
        location1.getLocationInfo();

        PersonalLoan personalLoan = new PersonalLoan("Chase", 7980, 1.7);
        personalLoan.calculateInterest();


        try {
            SavingsAccount savingsAccount1 = new SavingsAccount("133444", 50000, 400);
            savingsAccount1.withdraw(800000);
            {
                throw new InsufficientFundException("Insufficient fund");
            }


        } catch (InsufficientFundException e) {
            logger.warn("Insufficient funds" + e.getMessage());
        }

        try {
            SavingsAccount savingsAccount1 = new SavingsAccount("133444", 50000, 400);
            savingsAccount1.deposit(-200);
            {
                throw new NegativeAmountException("Negative Amount");
            }


        }
        catch (NegativeAmountException e) {
            logger.warn("Negative Amount" +e.getMessage());
        }
        try
        {
            SavingsAccount savingsAccount1 = new SavingsAccount("-10032", 50000, 400);
            savingsAccount1.getAccountID();
            {
                throw new AccountNotFoundException("Invalid account number");
            }

        }
        catch (AccountNotFoundException e)
        {
            logger.warn("Account not found" + e.getMessage());
        }
        try {
            SavingsAccount savingsAccount1 = new SavingsAccount("-10032", 50000, 400);
            savingsAccount1.withdraw(0);
            {
                throw new InvalidAmountException("Invalid Amount");
            }

        } catch (InvalidAmountException e) {
            logger.warn("Invalid Amount" + e.getMessage());
        }




    }
}

