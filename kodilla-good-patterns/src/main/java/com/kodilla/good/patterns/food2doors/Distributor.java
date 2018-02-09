package com.kodilla.good.patterns.food2doors;

import java.util.ArrayList;
import java.util.Map;

public interface Distributor {

    Map<Integer,Items> getInventory(ArrayList<Items> items);
}
