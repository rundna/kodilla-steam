package com.kodilla.good.patterns.food2doors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DistributorCreateInventory implements Distributor {

    public Map<Integer, Items> getInventory(ArrayList<Items> items) {
        Map<Integer, Items> map = new HashMap<>();
        for(Items item:items){
            map.put(map.size()+1,item);
        }
    return map;}
}
