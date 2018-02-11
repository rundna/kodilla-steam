package com.kodilla.good.patterns.food2doors;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MultiVit implements Shop {

    public void process(OrderItem order) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("banana", new Random().nextInt(order.getQuantity()+100));
        inventory.put("apple", new Random().nextInt(order.getQuantity()+100));
        inventory.put("mango", new Random().nextInt(order.getQuantity()+100));
        inventory.put("maracuja", new Random().nextInt(order.getQuantity()+100));
        inventory.put("tangerine", new Random().nextInt(order.getQuantity()+100));
        inventory.put("avocado", new Random().nextInt(order.getQuantity()+100));
        inventory.put("broccoli", new Random().nextInt(order.getQuantity()+100));
        inventory.put("pineapple", new Random().nextInt(order.getQuantity()+100));
        inventory.put("strawberries", new Random().nextInt(order.getQuantity()+100));
        inventory.put("orange", new Random().nextInt(order.getQuantity()+100));

        //for(Map.Entry<String, Integer> item:inventory.entrySet()){
            //System.out.println(item.getKey()+","+item.getValue());}

        if (inventory.containsKey(order.getProductName()) && inventory.get(order.getProductName()) >= order.getQuantity()) {
            Integer updatedQuantity = inventory.get(order.getProductName())-order.getQuantity();
            inventory.remove(order.getProductName());
            inventory.put(order.getProductName(),updatedQuantity);
            System.out.println("This delicious "+ order.getProductName() + " were individually selected by our best distributors like: "
                    + getClass().getSimpleName() + "\nYou can still purchase additional " + updatedQuantity + " items of our finest "
                    + order.getProductName() +"!\nPlease proceed to payment.\nThank you for using our service! Enjoy your purchase!");
        }else{
            System.out.println("We're sorry to inform, but we can not deliver your goods in amount of " + order.getQuantity());
        }
            //for(Map.Entry<String, Integer> item:inventory.entrySet()){
              //  System.out.println(item.getKey()+","+item.getValue());}
    }
}
