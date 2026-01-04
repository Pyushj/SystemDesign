package com.learning.lld.decorator;

public class ThinCrustPizza implements Pizza {

    @Override
    public String getDescription() {
        return "ThinCrust";
    }

    @Override
    public double getCost() {
        return 150.00;
    }
}
