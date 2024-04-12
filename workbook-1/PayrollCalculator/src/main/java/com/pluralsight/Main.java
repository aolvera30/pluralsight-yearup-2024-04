package com.pluralsight;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        //DECLARE Variables
        String employeeName;
        double hoursWorked;
        double payRate;
        double grossPay;

        //

        System.out.println("Payroll Calculator :) ");

        System.out.print("Name: ");
        employeeName = userInput.nextLine();

        System.out.print("Total hours worked: ");
        hoursWorked = userInput.nextDouble();

        System.out.print("Hourly Pay Rate: ");
        payRate = userInput.nextDouble();

        //Calculations

        grossPay = hoursWorked * payRate;

        System.out.printf("Gross pay: $%.2f", grossPay );

        System.out.print(" \nSave your money! ");
        System.out.print(employeeName);
















    }

}