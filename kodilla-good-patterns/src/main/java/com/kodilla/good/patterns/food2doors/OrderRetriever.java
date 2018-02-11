package com.kodilla.good.patterns.food2doors;

import java.security.Key;
import java.util.*;

public class OrderRetriever {
    private OrderDTO order;
    private Shop shop;

    public OrderDTO searchInventory(OrderItem searchedProduct) throws NoInventory
        {
        HashMap<String, Shop> inventory = new HashMap<>();

        inventory.put("banana", new VegeShop());
        inventory.put("apple",new VegeShop());
        inventory.put("mango",new TuttiFrutti());
        inventory.put("maracuja",new TuttiFrutti());
        inventory.put("tangerine", new MultiVit());
        inventory.put("avocado", new MultiVit());
        inventory.put("broccoli", new CrazyBananas());
        inventory.put("pineapple", new CrazyBananas());
        inventory.put("strawberries", new CrazyBananas());
        inventory.put("orange", new VegeShop());

        if(inventory.containsKey(searchedProduct.getProductName())){
            order = new OrderDTO(searchedProduct.getProductName(),inventory.get(searchedProduct.getProductName()),searchedProduct.getQuantity());
            System.out.println(order.toString());
        }
        //for(Map.Entry<String,Shop> item:inventory.entrySet()) {
            //boolean trfal = item.getKey().equals(searchedProduct.getProductName());
            //System.out.println(trfal + " " + item.getKey() + " " + searchedProduct.getProductName());
            //if (item.getKey().equals(searchedProduct.getProductName())) {
              //  order = new OrderDTO(item.getKey(), item.getValue(), searchedProduct.getQuantity());
                //Shop shop = (Shop) order.getShop();
                //shop.process();
              //  break;
           // }
        //}
            if(order==null){
                throw new NoInventory();
            }
            return order;}
}
