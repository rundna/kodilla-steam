package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

public class DemoUpdateStock {
    boolean updateStock = true;

    public ArrayList<OrderItem> updateStock(ArrayList<OrderItem> stock, OrderItem order) {
        for (OrderItem stockItem : stock) {
            if (stockItem.getProductID() == order.getProductID()) {
                Long updateQuantity = stockItem.getProductQuantity() - order.getProductQuantity();
                    if (updateQuantity==0){
                        updateStock = false;
                    }
                stock.remove(stockItem);
                stock.add(new OrderItem(order.getProductID(), order.getProductName(), updateQuantity, order.getManufactor(), updateStock));
                //System.out.println(stock.toString());
                break;
            }
        }
        return stock;
    }
}
