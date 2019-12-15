package com.nazislam.featureLambdaExpression;

@FunctionalInterface
public interface MyInterface {
    void printNumber(int number);
    static int giveNumber(int number) {
        return number;
    }
}
