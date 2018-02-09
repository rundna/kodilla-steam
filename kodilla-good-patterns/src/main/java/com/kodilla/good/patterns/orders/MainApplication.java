package com.kodilla.good.patterns.orders;

public class MainApplication {

    public static void main(String[] args){
        OrderRetrieve orderRetrieve = new OrderRetrieve();
        OrderObject orderObject = orderRetrieve.initialize();

        DemoPurchaseOrderProcess processOrder = new DemoPurchaseOrderProcess(new ConfirmationByMail(),new DemoSavePurchaseOrder(),new SearchQuery(),
                new DemoUpdateStock(), new DemoPurchaseOrderCreator(), new PaymentMethod());
        try{
        processOrder.orderProcess(orderObject);}
        catch (NoOrderException i){
            System.out.println("No order processed! Make new search");
        }





    }
}
