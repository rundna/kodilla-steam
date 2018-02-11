package com.kodilla.good.patterns.food2doors;

public class TuttiFrutti implements Shop{

    public void process(OrderItem order){
        System.out.println("Item found: "+order.getProductName()+" "+order.getQuantity());
    }
}
