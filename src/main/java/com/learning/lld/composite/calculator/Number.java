package com.learning.lld.composite.calculator;

public class Number implements Expression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int evaluate() {
        return number;
    }
}
