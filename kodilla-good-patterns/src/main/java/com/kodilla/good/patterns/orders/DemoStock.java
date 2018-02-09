package com.kodilla.good.patterns.orders;

import java.util.ArrayList;

public class DemoStock extends ArrayList<OrderItem> {
    //create a stock with random values

    public ArrayList<OrderItem> createDemoStock(){

        ArrayList<OrderItem> stock = new ArrayList<>();
        stock.add(new OrderItem(10001L,"phone case 1",100,"Bilkin",true));
        stock.add(new OrderItem(10002L,"phone case 2",20,"DemoCase",true));
        stock.add(new OrderItem(10003L,"phone case 3",1234,"Stargaze",true));
        stock.add(new OrderItem(10004L,"phone case 4",999,"CaseForAmaze",true));
        stock.add(new OrderItem(10005L,"cover glass",1,"Saszetki",true));
        stock.add(new OrderItem(9999L,"super charger XDM100",1,"ChargeMe",true));
        stock.add(new OrderItem(9998L,"super charger XDM150",1,"ChargeMe",false));

    return stock;}
}
