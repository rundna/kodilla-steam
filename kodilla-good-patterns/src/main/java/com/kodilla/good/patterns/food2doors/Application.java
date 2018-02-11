package com.kodilla.good.patterns.food2doors;

public class Application {

    public static void main(String[] args){
        SearchProduct product = new SearchProduct();
        OrderProcess process = new OrderProcess();
        //System.out.println(product.searchProduct().getProductName());
        //process.searchInventory(product.searchProduct());
        try {
            //System.out.println(product.searchProduct().getProductName());
            process.searchInventory(product.searchProduct());
        } catch (NoInventory noInventory) {
            System.out.println("Product not available!");
        }
    }
}
