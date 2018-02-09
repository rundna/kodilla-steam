package com.kodilla.good.patterns.orders;

import java.util.Objects;

public class OrderItem {

    private long productID;
    private String productName;
    private long productQuantity;
    private String manufactor;
    private boolean inStock;

    public OrderItem(long productID, String productName, long productQuantity, String manufactor, boolean inStock) {

        this.productID = productID;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.manufactor = manufactor;
        this.inStock = inStock;
    }

    public long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductQuantity() {
        return productQuantity;
    }

    public String getManufactor() {
        return manufactor;
    }

    public boolean getInStock(){
        return inStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return productID == orderItem.productID &&
                Objects.equals(productName, orderItem.productName) &&
                Objects.equals(manufactor, orderItem.manufactor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", manufactor='" + manufactor + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
