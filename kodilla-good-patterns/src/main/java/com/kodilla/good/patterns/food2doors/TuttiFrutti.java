package com.kodilla.good.patterns.food2doors;

import java.time.LocalDate;
import static java.time.LocalDate.now;

public class TuttiFrutti implements Shop{

    public void process(OrderItem order){
        System.out.println("Sorry to inform but this shop is out business starting from :" + LocalDate.now());
    }
}
