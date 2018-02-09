package com.kodilla.good.patterns.orders;

public class ReturnDTO {
    private boolean orderInStock;
    private String order;

    public ReturnDTO(boolean orderInStock, String order) {
        this.orderInStock = orderInStock;
        this.order = order;
    }

    public boolean isOrderInStock() {
        return orderInStock;
    }

    public String getOrder() {
        return order;
    }
}
