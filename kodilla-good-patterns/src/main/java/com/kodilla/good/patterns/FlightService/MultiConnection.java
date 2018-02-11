package com.kodilla.good.patterns.FlightService;

import java.util.Objects;

public class MultiConnection {
    private String departure;
    private String connectingFlight;
    private String arrival;

    public MultiConnection(String departure, String connectingFlight, String arrival) {
        this.departure = departure;
        this.connectingFlight = connectingFlight;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getConnectingFlight() {
        return connectingFlight;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiConnection that = (MultiConnection) o;
        return Objects.equals(departure, that.departure) &&
                Objects.equals(connectingFlight, that.connectingFlight) &&
                Objects.equals(arrival, that.arrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrival);
    }

    @Override
    public String toString() {
        return "MultiConnection{" +
                "departure='" + departure + '\'' +
                ", connectingFlight='" + connectingFlight + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
