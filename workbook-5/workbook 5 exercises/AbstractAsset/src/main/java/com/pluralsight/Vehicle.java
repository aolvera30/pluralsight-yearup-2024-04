package com.pluralsight;

public class Vehicle extends Asset
{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description,String dateAcquired,double originalCost,String makeModel,int year,int odometer)
    {
        super(description,dateAcquired,originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getOdometer()
    {
        return odometer;
    }

    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue(); // Get the current year
        int age = currentYear - year; // Calculate the age of the vehicle
        double value = getOriginalCost();

        // Determine the value reduction based on age
        if (age <= 3) {
            value *= (1 - 0.03 * age); // 3% reduction per year for 0-3 years
        } else if (age <= 6) {
            value *= (1 - 0.03 * 3); // First 3 years
            value *= (1 - 0.06 * (age - 3)); // Next 3 years
        } else if (age <= 10) {
            value *= (1 - 0.03 * 3); // First 3 years
            value *= (1 - 0.06 * 3); // Next 3 years
            value *= (1 - 0.08 * (age - 6)); // Next 4 years
        } else {
            value = 1000.00; // Over 10 years old
        }

        // Adjust value for high mileage unless it's a Honda or Toyota
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75; // Reduce by 25%
        }


        return value;
    }
}
