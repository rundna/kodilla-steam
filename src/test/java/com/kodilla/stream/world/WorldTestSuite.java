package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given create countires
            World world = new World();
            Country India = new Country("India", new BigDecimal("340000000"));
            Country China = new Country("China", new BigDecimal("1040000000"));
            Country Russia = new Country("Russia", new BigDecimal("500000000"));
            Country Brazil = new Country("Brazil", new BigDecimal("200000000"));
            Country Argentina = new Country("Argentina", new BigDecimal("140000000"));
            Country Peru = new Country("Peru", new BigDecimal("50000000"));
            //Country Egypt = new Country("Egypt", new BigDecimal("70000000"));
            //Country Congo = new Country("Congo", new BigDecimal("40000000"));
            //Country RepOfSouthAfrica = new Country("RepOfSouthAfrica", new BigDecimal("550000000"));
            //Country Uganda = new Country("Uganda", new BigDecimal("77777777777"));
            Continent Asia = new Continent("Asia");
            Continent SouthAmerica = new Continent("SouthAmerica");
            Continent Africa = new Continent("Africa");

            Asia.addCountry(India);
            Asia.addCountry(China);
            Asia.addCountry(Russia);
            SouthAmerica.addCountry(Brazil);
            SouthAmerica.addCountry(Argentina);
            SouthAmerica.addCountry(Peru);
            Africa.addCountry(new Country("Egypt", new BigDecimal("70000000")));
            Africa.addCountry(new Country("Congo", new BigDecimal("40000000")));
            Africa.addCountry(new Country("RepOfSouthAfrica", new BigDecimal("550000000")));
            Africa.addCountry(new Country("Uganda", new BigDecimal("77777777777")));
            //When
            world.addContinent(Asia);
            world.addContinent(SouthAmerica);
            world.addContinent(Africa);

            //Then
            BigDecimal totalPopulation = world.getPeopleQuantity();
            BigDecimal expectedPopulation = new BigDecimal("80707777777");
            Assert.assertEquals(expectedPopulation,totalPopulation);
    }
}
