package com.kodilla.good.patterns.FlightService;

import java.util.Objects;

public class Connection {

    private String departure;
    private String arrival;

    public Connection(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection that = (Connection) o;
        return Objects.equals(departure, that.departure) &&
                Objects.equals(arrival, that.arrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departure,arrival);
    }

    @Override
    public String toString() {
        return "Connection{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
