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

    private void calculatePricePerNight()
    {
      switch (roomType.toLowerCase()) {
          case "king":

      }
    }


}
