package com.kodilla.good.patterns.FlightService;

import java.util.ArrayList;

public class ConnectionRepository {

    public ArrayList<Connection> createRepository(){

        ArrayList<Connection> connectionList = new ArrayList<>();
        connectionList.add(new Connection("Gdansk","Cracow"));
        connectionList.add(new Connection("Warsaw","Wroclaw"));
        connectionList.add(new Connection("Warsaw","Poznan"));
        connectionList.add(new Connection("Poznan","Gdansk"));
        connectionList.add(new Connection("Gdansk","Warsaw"));
        connectionList.add(new Connection("Lodz","Poznan"));
        connectionList.add(new Connection("Radom","Gdansk"));
        connectionList.add(new Connection("Gdansk","Poznan"));
        connectionList.add(new Connection("Poznan","Warsaw"));
        return connectionList;}
}
