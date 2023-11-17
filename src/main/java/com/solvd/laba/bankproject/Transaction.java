package com.solvd.laba.bankproject;

import java.util.Date;



public class Transaction {
    protected double balance;
    public Date date;

    void checkbalance()
    {
        System.out.println("Current Balance" + "as on" + date);
    }
}
