package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);



    }
}
