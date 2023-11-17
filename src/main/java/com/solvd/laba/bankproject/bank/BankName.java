package com.solvd.laba.bankproject.bank;

public class BankName {
    private String name;

    public BankName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    final void WelcomeMessage() {
        System.out.println("Welcome to Chase bank");
    }


}
