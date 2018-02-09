package com.kodilla.good.patterns.orders;

public class DemoCustomer {

    private Customer customer;

    public Customer createCustomer(){
        Customer customer = new Customer("Karol","Serwowski","kser","kser@hotmail.com","Swojska 1/a"
                , 432659000L,true);
     return customer;
    }
}
