package com.nazislam.featureInterface;

public class Play implements Interface1 {

    @Override
    public void print(String str) {
        System.out.println("This prints this: " + str);
    }

    public static void main(String[] args) {
        int returnedNumber = Interface1.getNumber(4);
        System.out.println(returnedNumber);
    }


}
