package com.learning.lld.decorator;

public class MushroomPizzaDecorator extends PizzaDecorator {

    public MushroomPizzaDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " Mushroom";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 75.00;
    }
}
