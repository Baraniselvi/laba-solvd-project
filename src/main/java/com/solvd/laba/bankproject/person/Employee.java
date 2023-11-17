package com.solvd.laba.bankproject.person;

import com.solvd.laba.bankproject.Location;
import com.solvd.laba.bankproject.customer.CustomerService;

import java.util.Objects;

public class Employee extends Person implements Iwork, CustomerService {
    private Location location;
    private String position;
    private double salary;

    public Employee(String firstname, String lastname, Location location, String position, double salary) {
        super(firstname, lastname);
        this.location = location;
        this.position = position;
        this.salary = salary;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getFullNAME() {
        return firstname + lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "location=" + location +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(location, employee.location) && Objects.equals(position, employee.position) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location, position, salary);
    }

    @Override
    public void work() {
        System.out.println("I am an employee");
    }

    @Override
    public void reportLostorStolencard() {
        System.out.println("Report stolen or lost debit card");
    }

    @Override
    public void requestNewDebitcard() {
        System.out.println("New Debit card process");

    }
}



