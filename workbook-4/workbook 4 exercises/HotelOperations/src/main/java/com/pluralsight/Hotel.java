package com.pluralsight;

public class Hotel
{
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this(name, numberOfSuites, numberOfRooms, 0, 0);
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // booking room method
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite) {
            if(numberOfRooms <= getAvailableSuites()) {
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if(numberOfRooms <= getAvailableRooms()) {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;


    }

    // Derived getter for available suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // Derived getter for available rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // Other getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedBasicRooms;
    }


}








