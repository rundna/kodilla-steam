package com.kodilla.good.patterns.food2doors;

import java.util.HashMap;
import java.util.Random;

public class SearchProduct {

    public OrderItem searchProduct(){
        HashMap<Integer,String> productNames = new HashMap<>();
        productNames.put(productNames.size(),"mango");
        productNames.put(productNames.size(),"banana");
        productNames.put(productNames.size(),"avocado");
        productNames.put(productNames.size(),"maracuja");
        productNames.put(productNames.size(),"pineapple");
        productNames.put(productNames.size(),"orange");

        OrderItem product = new OrderItem(productNames.get(new Random().nextInt(productNames.size())),new Random().nextInt(productNames.size()*2));
        return product;
    }
}
