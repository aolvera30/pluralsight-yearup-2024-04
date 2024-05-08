package com.pluralsight;

import java.util.Locale;

public class Reservation
{
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        calculatePricePerNight();
    }


    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
        calculatePricePerNight();
    }


    public double getPrice() {
        return numberOfNights * pricePerNight;
    }

    public int getNumberOfNights()
    {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights)
    {
        this.numberOfNights = numberOfNights;
        calculatePricePerNight();
    }

    public boolean isWeekend()
    {
        return isWeekend;
    }

    public void setWeekend(boolean weekend)
    {
        isWeekend = weekend;
        calculatePricePerNight();
    }

    public double getPricePerNight()
    {
        return pricePerNight;
    }

    private void calculatePricePerNight() {
        double basePrice;
        switch (roomType.toLowerCase()) {
            case "king":
                basePrice = 139.00;
                break;
            case "double":
                basePrice = 124.00;
                break;
            default:
                basePrice = 0.00; // Default to 0 if room type is not recognized
        }

        if (isWeekend) {
            basePrice *= 1.10; // Increase price by 10% if it's a weekend
        }

        pricePerNight = basePrice;
    }

    // Derived getter for total reservation cost
    public double getReservationTotal() {
        return getPrice(); // Total cost is price per night multiplied by number of nights
    }


}



