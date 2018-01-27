package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal population;

    public BigDecimal getPeopleQuantity(){
        return population;
    }

    public Country(String countryName, BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }


    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(population, country.population);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName, population);
    }
}
