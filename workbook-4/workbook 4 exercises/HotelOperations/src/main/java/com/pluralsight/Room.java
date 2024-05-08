package com.pluralsight;

public class Room
{
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

        checkIn();
        checkOut();
        cleanRoom();
    }


    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public double getPrice()
    {
        return price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }



    public void checkIn()
    {
        if(!isOccupied){
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest checked in :) ");
        } else {
            System.out.println("Room is already occupied. ");
        }

    }

    public void checkOut()
    {
        if(isOccupied){
            cleanRoom();
            isOccupied = false;
            System.out.println("Guest checked out :) ");
        } else {
            System.out.println("No guest to check out. ");
        }

    }

    public void cleanRoom()
    {
        isDirty = false;
        System.out.println("Room cleaned");
    }

}

