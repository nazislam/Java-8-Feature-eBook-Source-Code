package com.nazislam.featureLambdaExpression;

public class FeatureLambdaExpression {

    public static void main(String[] args) {
        MyInterface myInterface = (number) -> System.out.println(number);
        myInterface.printNumber(50000);
        System.out.println(MyInterface.giveNumber(100));
    }
}
