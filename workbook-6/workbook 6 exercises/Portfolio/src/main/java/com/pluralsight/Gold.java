package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight, double value) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
