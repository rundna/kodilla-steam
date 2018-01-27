package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + i) * i;
            //System.out.println(numbers[i]);
        }

        Double test = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(247.0,test,0.001);
    }
}
