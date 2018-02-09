package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

public interface OrdersRepository {

    ArrayList<DemoPurchaseOrder> saveOrder(DemoPurchaseOrder order);
}
