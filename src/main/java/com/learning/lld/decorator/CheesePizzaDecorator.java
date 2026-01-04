package com.learning.lld.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{

    public CheesePizzaDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 50.00;
    }
}
