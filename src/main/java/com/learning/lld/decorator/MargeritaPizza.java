package com.learning.lld.decorator;

public class MargeritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margarita";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
