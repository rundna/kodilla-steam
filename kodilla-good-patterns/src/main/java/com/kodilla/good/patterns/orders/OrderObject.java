package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

public class OrderObject {

    private Customer customer;
    private OrderItem orderItem;
    private ArrayList<OrderItem> stock;

    public OrderObject(Customer customer, OrderItem orderItem, ArrayList<OrderItem> stock) {
        this.customer = customer;
        this.orderItem = orderItem;
        this.stock = stock;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public ArrayList<OrderItem> getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "OrderObject{" +
                "customer=" + customer +
                ", orderItem=" + orderItem +
                ", stock=" + stock +
                '}';
    }
}
