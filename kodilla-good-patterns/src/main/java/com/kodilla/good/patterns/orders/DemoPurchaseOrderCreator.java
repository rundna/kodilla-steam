package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class DemoPurchaseOrderCreator implements OrderService{

    public DemoPurchaseOrder generate(Customer customer, OrderItem order,ReturnDTO returnType){
        OrderItem updatedOrder = new OrderItem(order.getProductID(),returnType.getOrder(),order.getProductQuantity(),order.getManufactor(),order.getInStock());
        LocalDate purchaseDate = LocalDate.now();
        LocalDate shippingDate = purchaseDate.plusDays(7);
        return new DemoPurchaseOrder(customer,purchaseDate,shippingDate,updatedOrder);
    }
}
