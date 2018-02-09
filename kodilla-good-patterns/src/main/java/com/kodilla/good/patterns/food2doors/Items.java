package com.kodilla.good.patterns.food2doors;

import java.util.Objects;

public class Items {
    private String distributor;
    private String productType;
    private Long productQuantity;

    public Items(String distributor, String productType, Long productQuantity) {
        this.distributor = distributor;
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getProductType() {
        return productType;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(distributor, items.distributor) &&
                Objects.equals(productType, items.productType) &&
                Objects.equals(productQuantity, items.productQuantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(distributor);
    }
}
