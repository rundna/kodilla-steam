package com.kodilla.good.patterns.FlightService;

public class Application {

    public static void main(String[] args){
        ConnectionRepository connection = new ConnectionRepository();
        SearchConnection searchConnection = new SearchConnection();
        searchConnection.searchByOutBound(connection.createRepository(),"Gdansk");
        searchConnection.searchByInBound(connection.createRepository(),"Warsaw");
        searchConnection.searchMultiConnection(connection.createRepository(),"Warsaw");


    }
}
