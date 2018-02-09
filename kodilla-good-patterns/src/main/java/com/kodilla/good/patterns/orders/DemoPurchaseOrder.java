package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class DemoPurchaseOrder {

    public Customer customer;
    public LocalDate purchaseDate;
    public LocalDate shippingDate;
    public OrderItem order;

    public DemoPurchaseOrder(Customer customer, LocalDate purchaseDate, LocalDate shippingDate, OrderItem order) {
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.shippingDate = shippingDate;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public OrderItem getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "DemoPurchaseOrder{" +
                "customer=" + customer +
                ", purchaseDate=" + purchaseDate +
                ", shippingDate=" + shippingDate +
                ", order=" + order +
                '}';
    }
}
