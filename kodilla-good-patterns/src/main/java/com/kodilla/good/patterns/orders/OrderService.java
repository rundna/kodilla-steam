package com.kodilla.good.patterns.orders;

public interface OrderService {

    DemoPurchaseOrder generate(Customer customer, OrderItem order,ReturnDTO returnType);
}
