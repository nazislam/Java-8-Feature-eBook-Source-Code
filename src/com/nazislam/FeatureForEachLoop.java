package com.nazislam;

import java.util.ArrayList;

public class FeatureForEachLoop {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("item in numbers: " + numbers.get(i));
        }

        numbers.forEach(item -> {
            System.out.println("item in numbers using ForEach Loop: " + item);
        });
    }
}
