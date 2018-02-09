package com.kodilla.good.patterns.orders;

public class PaymentMethod implements Payment{

    public Integer processPayment(){
        Integer paymentBy = 2;
        switch(paymentBy){
            case 1: System.out.println("Payment method: Cash");
                    break;
            case 2: System.out.println("Payment method: Credit Card");
                    break;
            case 3: System.out.println("Payment method: PayPal");
                    break;
            default: System.out.println("No payment method selected! Choose payment method to finalize Your order.");
        }
    return paymentBy;}
}
