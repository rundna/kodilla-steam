package com.kodilla.good.patterns.food2doors;

import java.util.Objects;

public class OrderDTO {

    private String product;
    private Object shop;
    private Integer quantity;

    public OrderDTO(String product, Object shop, Integer quantity) {
        this.product = product;
        this.shop = shop;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public Object getShop() {
        return shop;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(product, orderDTO.product) &&
                Objects.equals(shop, orderDTO.shop) &&
                Objects.equals(quantity, orderDTO.quantity);
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "product='" + product + '\'' +
                ", shop=" + shop +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(product, shop);
    }
}
