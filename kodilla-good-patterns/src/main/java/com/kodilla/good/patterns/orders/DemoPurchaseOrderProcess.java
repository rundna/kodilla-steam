package com.kodilla.good.patterns.orders;

public class DemoPurchaseOrderProcess {
    private ConfirmationByMail confirmation;
    private DemoPurchaseOrderCreator purchaseOrderCreator;
    private DemoSavePurchaseOrder savePurchase;
    private DemoUpdateStock updateStock;
    private SearchQuery searchQuery;
    private PaymentMethod paymentMethod;

    public DemoPurchaseOrderProcess(final ConfirmationByMail confirmation, final DemoSavePurchaseOrder savePurchase,
                                    final SearchQuery searchQuery, final DemoUpdateStock updateStock,
                                    final DemoPurchaseOrderCreator purchaseOrderCreator, final PaymentMethod paymentMethod) {
        this.confirmation = confirmation;
        this.savePurchase = savePurchase;
        this.updateStock = updateStock;
        this.searchQuery = searchQuery;
        this.purchaseOrderCreator = purchaseOrderCreator;
        this.paymentMethod = paymentMethod;
    }

    public DemoPurchaseOrder orderProcess(OrderObject order) throws NoOrderException{
       ReturnDTO returnType = searchQuery.searchRequest(order.getOrderItem(),order.getStock());
       Integer payment = paymentMethod.processPayment();
       if(returnType.isOrderInStock() && payment!=0){
           DemoPurchaseOrder newOrder = purchaseOrderCreator.generate(order.getCustomer(),order.getOrderItem(),returnType);
           updateStock.updateStock(order.getStock(),order.getOrderItem());
           savePurchase.saveOrder(newOrder);
           confirmation.confirmationNotice(newOrder);
           return newOrder;
            }
           else{
           throw new NoOrderException();
       }
    }
}
