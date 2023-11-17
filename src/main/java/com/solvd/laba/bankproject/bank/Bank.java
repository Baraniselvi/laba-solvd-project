package com.solvd.laba.bankproject.bank;

import com.solvd.laba.bankproject.Location;
import com.solvd.laba.bankproject.person.Customer;
import com.solvd.laba.bankproject.person.Employee;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankName> bankname;
    ;
    private ArrayList<Customer> customer;

    private ArrayList<Location> location;

    private ArrayList<Employee> employee;


    public Bank(ArrayList<BankName> bankname, ArrayList<Customer> customer, ArrayList<Location> location, ArrayList<Employee> employee) {
        this.bankname = bankname;
        this.customer = customer;
        this.location = location;
        this.employee = employee;
    }

    public ArrayList<BankName> getBankname() {
        return bankname;
    }

    public void setBankname(ArrayList<BankName> bankname) {
        this.bankname = bankname;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public ArrayList<Location> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Location> location) {
        this.location = location;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
}



