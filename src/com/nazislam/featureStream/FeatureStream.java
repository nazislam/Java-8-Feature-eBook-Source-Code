package com.nazislam.featureStream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FeatureStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        Stream<Integer> sequentialStream = numbers.stream();
        Stream<Integer> parallelStream = numbers.parallelStream();

        Stream<Integer> highNumbers = parallelStream.filter(x -> x > 90);
        highNumbers.forEach(item -> System.out.println("parallel stream output number: " + item));

        Stream<Integer> highNumbersSeq = sequentialStream.filter(x -> x > 90);
        highNumbersSeq.forEach(item -> System.out.println("sequential stream output number: " + item));
    }
}
