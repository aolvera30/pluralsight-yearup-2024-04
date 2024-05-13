package com.pluralsight;

public class Main
{
    public static void main(String[] args) {

        SemiTruck bigT = new SemiTruck();

        bigT.setNumberOfWheels(18);
        bigT.setSleeperCab(true);

        System.out.println("Number of Wheels: " + bigT.getNumberOfWheels());
        System.out.println("Sleeper Cab: " + bigT.isSleeperCab());

    }

}