package com.solvd.laba.bankproject;

public class Location implements LocationInterface{
    private String city;

    private String country;
    protected String phonenumber;

    public Location(String city, String country, String phonenumber) {
        super();
        this.city = city;
        this.country = country;
        this.phonenumber = phonenumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String getLocationInfo() {
        return city + country;
    }
}

