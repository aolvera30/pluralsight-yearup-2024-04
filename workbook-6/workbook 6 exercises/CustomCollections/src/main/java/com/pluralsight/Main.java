package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a FixedList for Integers
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        try {
            numbers.add(43); // This line should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Outputs: Cannot add more items, list is full.
        }

        System.out.println("Number of items in numbers list: " + numbers.getItems().size()); // Outputs: 3

        // Create a FixedList for LocalDate
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        try {
            dates.add(LocalDate.of(2023, 5, 22)); // This line should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Outputs: Cannot add more items, list is full.
        }

        System.out.println("Number of items in dates list: " + dates.getItems().size()); // Outputs: 2
    }
}