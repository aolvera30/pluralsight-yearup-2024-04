package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        //Variables

        int regular = 1;
        double regularBasePrice = 5.45;
        int large = 2;
        double largeBaseSandwichPrice = 8.95;

        // Sandwich size
        System.out.print("Sandwich number 1 or 2? ");
        int size = userInput.nextInt();

        //Age
        System.out.print("What is your age? ");
        int age = userInput.nextInt();

        //Calculate discount based on age
        double discount;
        if (age <= 17) {
            discount = 0.1; //10% discount
        } else if (age >= 65) {
            discount = 0.2; //20% discount
        } else {
            discount = 0.0; // no discount
        }

        //Calculate total price based on sandwich size and discount
        double totalPrice;
        if (size == regular) {
            totalPrice = regularBasePrice * (1 - discount);
        } else if (size == large) {
            totalPrice = largeBaseSandwichPrice * (1 - discount);
        } else {
            System.out.print("Invalid size selection");
            return;
        }

        // Display total price
        System.out.println("Total Cost: $"+String.format("%.2f", totalPrice));

        System.out.println("Enjoy :) ");
    }


}
