package com.kodilla.good.patterns.orders;

public class ConfirmationByMail implements Confirmation {

    public void confirmationNotice(DemoPurchaseOrder order){
        System.out.println("Your confirmation mail was sent to: " + order.getCustomer().getEmailAddress()+"\n" +
                "Please check your shipping details below: \n" +
                "First name: " + order.getCustomer().getFirstName() +"\n"+
                "Last name: " + order.getCustomer().getLastName() +"\n"+
                "Shipping address: " + order.getCustomer().getAddress() +"\n"+
                "Contact phone: " + order.getCustomer().getPhoneNumber() +"\n"+
                "Purchase date: " + order.getPurchaseDate() +"\n"+
                "Estimated delivery date: " + order.getShippingDate() +"\n"+
                "Purchased product: " + order.getOrder().getProductName() +"\n"+
                "Manufactor: " + order.getOrder().getManufactor() +"\n"+
                "Quantity: " + order.getOrder().getProductQuantity() +"\n");
    }
}
