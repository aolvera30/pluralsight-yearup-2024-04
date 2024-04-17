package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //cellPhone Instance
        CellPhone myPhone = new CellPhone();

        //userInput

        System.out.println("Please proceed by inputing all phone information: ");
        System.out.println("Serial number? ");
        int serialNumber = userInput.nextInt();

        userInput.nextLine();

        System.out.println("Phone model? ");
        String model = userInput.nextLine();

        System.out.println("Carrier? ");
        String carrier = userInput.nextLine();

        System.out.println("Phone Number? ");
        String phoneNumber = userInput.nextLine();

        System.out.println("Device owner? ");
        String owner = userInput.nextLine();

        //setters
        myPhone.setSerialNumber(serialNumber);
        System.out.println(serialNumber);

        myPhone.setModel(model);
        System.out.println(model);

        myPhone.setCarrier(carrier);
        System.out.println(carrier);

        myPhone.setPhoneNumber(phoneNumber);
        System.out.println(phoneNumber);

        myPhone.setOwner(owner);
        System.out.println(owner);







    }
}