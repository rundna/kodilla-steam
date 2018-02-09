package com.kodilla.good.patterns.food2doors;

import java.util.ArrayList;
import java.util.Map;

public class ExtraFoodShop {
private Items item;

    public Items process(Items item){
        ArrayList<Items> list = new ArrayList<>();
        DistributorCreateInventory inventory = new DistributorCreateInventory();
        Map<Integer, Items> EFSmap = inventory.getInventory(list);
         for(Map.Entry<Integer,Items> entry:EFSmap.entrySet()){
             EFSmap.put(entry.getKey()+99000,entry.getValue());
         }
         for(Map.Entry<Integer,Items> entry:EFSmap.entrySet()){
             if(entry.getValue().getProductType()==item.getProductType() &&
                     entry.getValue().getProductQuantity()>=item.getProductQuantity()){
                 item= entry.getValue();
                 break;
             }
         }
    return item;}

    public void showOrder(Items item){

        System.out.println("Your order is: "+ item);
    }
}
