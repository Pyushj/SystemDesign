package com.learning.lld.composite.calculator;

public class ArithmeticExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private Operation operation;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public int evaluate() {
        switch (operation) {
            case ADD -> {
                return leftExpression.evaluate() + rightExpression.evaluate();
            }
            case SUBSTRACT -> {
                return leftExpression.evaluate() - rightExpression.evaluate();
            }
            case MULTIPLY -> {
                return leftExpression.evaluate() * rightExpression.evaluate();
            }
            case DIVIDE -> {
                return leftExpression.evaluate() / rightExpression.evaluate();
            }
        }
        return 0;
    }
}
