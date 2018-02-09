package com.kodilla.good.patterns.orders;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.ArrayList;

public class SearchQuery {
    boolean request = false;
    ReturnDTO returnType;

    public ReturnDTO searchRequest(OrderItem order, ArrayList<OrderItem> stock) {
        for (OrderItem stockItem : stock) {
            if (stockItem.getProductName().contains(order.getProductName()) && stockItem.getProductID() == order.getProductID() && stockItem.getInStock() == true &&
                    stockItem.getProductQuantity() >= order.getProductQuantity()) {
                request = true;
                returnType = new ReturnDTO(request, stockItem.getProductName());
            }
        }
        return returnType;}
}
