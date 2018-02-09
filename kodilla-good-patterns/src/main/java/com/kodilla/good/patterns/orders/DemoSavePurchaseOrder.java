package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

 class DemoSavePurchaseOrder implements OrdersRepository{

    public ArrayList<DemoPurchaseOrder> saveOrder(DemoPurchaseOrder order) {
        ArrayList<DemoPurchaseOrder> orderRepository = new ArrayList<>();
        orderRepository.add(order);
        for(DemoPurchaseOrder orderItem: orderRepository){
        }
        //System.out.println(orderRepository.toString());
        return orderRepository;
    }
}
