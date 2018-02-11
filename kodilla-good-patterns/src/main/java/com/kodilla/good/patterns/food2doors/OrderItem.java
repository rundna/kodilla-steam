package com.kodilla.good.patterns.food2doors;

import java.util.Objects;

public class OrderItem {
    private String productName;
    private Integer quantity;

    public OrderItem(String productName, Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(productName, orderItem.productName) &&
                Objects.equals(quantity, orderItem.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName);
    }
}
