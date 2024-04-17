package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first,middle(if you have one), and last name: ");
        String input = userInput.nextLine().trim();

        //Split input
        String[] nameParts = input.split("\\s+");

        // individual pieces of the name
        if (nameParts.length == 2) {
            // First Last format
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else if (nameParts.length == 3) {
            // First Middle Last format
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else {
            // Invalid input format
            System.out.println("Invalid input format.");
        }


    }
}


