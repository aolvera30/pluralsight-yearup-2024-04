package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //variables
        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String fullName;


        //first name
        System.out.println("What is your first name? ");
        firstName = userInput.nextLine().strip();

        //middle name
        System.out.println("What is your middle name? If you don't have one just press enter. ");
        middleName = userInput.nextLine().strip();

        if (middleName.isEmpty()){
            middleName = "";

        }

        //last name
        System.out.println("What is your last name? ");
        lastName = userInput.nextLine().strip();

        //suffix
        System.out.println("If you have a suffix please enter, if not just press enter.");
        suffix = userInput.nextLine().strip();

         //full last name
        fullName = ( firstName + " " + middleName + " " + lastName + " " + suffix );
            System.out.println(fullName);


    }
}