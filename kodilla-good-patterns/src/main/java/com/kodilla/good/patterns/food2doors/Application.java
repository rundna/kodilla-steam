package com.kodilla.good.patterns.food2doors;

public class Application {

    public static void main(String[] args){
        OrderProcessor order = new OrderProcessor(new SearchProduct(), new OrderRetriever());
        order.process();
    }
}
