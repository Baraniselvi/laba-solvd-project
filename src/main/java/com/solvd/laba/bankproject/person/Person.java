package com.solvd.laba.bankproject.person;

import java.util.Objects;

public abstract class Person {
    protected String firstname;
    protected String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public abstract String getFullNAME();

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }


}
