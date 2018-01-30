package com.kodilla.exeption.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    String arrivalFlight=null;
    String departureFlight=null;

    public void findFlight(Flight flight)throws RouteNotFoundException{
        HashMap<String,Boolean> flightMap = new HashMap<>();
        flightMap.put("Los Angeles Airport",true);
        flightMap.put("Frankfurt am Main Airport",true);
        flightMap.put("Gdansk Lech Walesa Airport",false);
        flightMap.put("Heathrow Airport",false);

        for(Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
            if (flight.getArrivalAirport() != null && flight.getArrivalAirport() instanceof String && flight.getArrivalAirport() == entry.getKey() & entry.getValue() == true) {
                this.arrivalFlight = entry.getKey();}
                }
        for(Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
            if (flight.getDepartureAirport() != null && flight.getDepartureAirport() instanceof String && flight.getDepartureAirport() == entry.getKey() & entry.getValue() == true) {
                this.departureFlight = entry.getKey();}

        }
        if (this.departureFlight!=null & this.arrivalFlight!=null) {
            System.out.println("Your flight from " + departureFlight + " to " + arrivalFlight + " is valid!");
        }else{
            throw new RouteNotFoundException();}
        }

    public static void main(String[] args) {
        //FlightSearch checkConnection = new FlightSearch();
        //FlightSearch checkConnection2 = new FlightSearch();
        //FlightSearch checkConnection3 = new FlightSearch();
        //FlightSearch checkConnection4 = new FlightSearch();
        FlightSearch checkConnection5 = new FlightSearch();

        try {
            //checkConnection.findFlight(new Flight("Helsinki", "Poznan"));
            //checkConnection2.findFlight(new Flight("Gdansk Lech Walesa Airport", "Poznan"));
            //checkConnection3.findFlight(new Flight("Los Angeles Airport", "Frankfurt am Main Airport"));
            //checkConnection4.findFlight(new Flight("Berlin Flughafen", "Frankfurt am Main Airport"));
            checkConnection5.findFlight(new Flight("Gdansk Lech Walesa Airport", "Frankfurt am Main Airport"));



        }catch (RouteNotFoundException e){
            System.out.println("No flight connection, or invalid input");
        }finally{
            System.out.println("Still here");

        }
    }
        }
