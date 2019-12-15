package com.nazislam.featureTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class FeatureTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
