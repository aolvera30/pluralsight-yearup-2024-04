package com.pluralsight;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms, double value) {
        super(name, value);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}