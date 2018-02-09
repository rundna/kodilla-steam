package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

public class OrderRetrieve {

public OrderObject initialize(){
    DemoCustomer customer = new DemoCustomer();
    DemoSearchItem item = new DemoSearchItem();
    DemoStock stock = new DemoStock();
   return new OrderObject(customer.createCustomer(),item.getSearchedOrderItem(),stock.createDemoStock());
}


}
