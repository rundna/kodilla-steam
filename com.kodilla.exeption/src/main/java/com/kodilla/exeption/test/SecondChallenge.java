package com.kodilla.exeption.test;

import java.io.IOException;

public class SecondChallenge extends ExceptionHandling{
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling{
        if (x >= 2 || x > 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(3, 4);

            }catch (ExceptionHandling e){
            System.out.println("Error calculation");
        }finally{
            System.out.println("Still here");

        }
    }
}