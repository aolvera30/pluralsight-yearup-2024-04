package com.pluralsight;

public class Car
{
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    // <editor-fold desc="getters">
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getSpeed()
    {
        return speed;
    }

    // </editor-fold>

    public void accelerate(int increaseBy)
    {
        if(increaseBy > 0)
        {
            speed += increaseBy;
        }
    }

    public void brake(int decreaseBy)
    {
        speed -= decreaseBy;
    }
}
