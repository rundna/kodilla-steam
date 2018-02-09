package com.kodilla.good.patterns.orders;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private String emailAddress;
    private String address;
    private long phoneNumber;
    private boolean isLogged;

    public Customer(String firstName, String lastName, String userName, String emailAddress, String address, long phoneNumber, boolean isLogged) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isLogged = isLogged;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isLogged() {
        return isLogged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return isLogged == customer.isLogged &&
                Objects.equals(userName, customer.userName) &&
                Objects.equals(emailAddress, customer.emailAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, emailAddress, isLogged);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isLogged=" + isLogged +
                '}';
    }
}
