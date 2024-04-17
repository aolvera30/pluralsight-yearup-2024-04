package com.pluralsight;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = userInput.nextLine().strip();

        System.out.println("Enter your middle name (press enter if none):");
        String middleName = userInput.nextLine().strip();

        System.out.println("Enter your last name");
        String lastName = userInput.nextLine().strip();

        System.out.println("Enter your suffix (press enter if none):");
        String suffix = userInput.nextLine().strip();


        if(middleName.isEmpty()){
            boolean b = middleName == "";
        }

        String fullName ="Full Name:" + " " + firstName + " " + middleName + " " + lastName + " " + suffix;
        System.out.println(fullName);
}

}

