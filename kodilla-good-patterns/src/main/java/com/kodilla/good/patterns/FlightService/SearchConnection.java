package com.kodilla.good.patterns.FlightService;

import java.util.*;
import java.util.stream.Collectors;

public class SearchConnection {
    List<MultiConnection> multi;

    public List<Connection> searchByOutBound(List<Connection> connection,String airport){
        List<Connection> outBound = connection.stream()
                .filter(out->out.getDeparture().equals(airport))
                .collect(Collectors.toList());
        System.out.println(outBound);
        return outBound;}

    public List<Connection> searchByInBound(List<Connection> connection,String airport){
        List<Connection> inBound = connection.stream()
                .filter(out->out.getArrival().equals(airport))
                .collect(Collectors.toList());
        System.out.println(inBound);
        return inBound;}

        public List<MultiConnection> searchMultiConnection(List<Connection> connection, String destination){
        ArrayList<Connection> multi = new ArrayList<>();
            ArrayList<MultiConnection> multi3 = new ArrayList<>();
        for(Connection flight:connection){
            if(flight.getArrival().equals(destination)){
                multi.add(new Connection(flight.getDeparture(),flight.getArrival()));
                }
            }
            for(Connection flight2:connection) {
                for (Connection flight3 : multi) {
                    if (flight2.getArrival().equals(flight3.getDeparture())&& flight3.getArrival()!=flight2.getDeparture()) {
                        multi3.add(new MultiConnection(flight2.getDeparture(),flight2.getArrival(),flight3.getArrival()));
                    }
                }
            }
            //System.out.println(multi);
            System.out.println(multi3);
        return multi3;}

}
