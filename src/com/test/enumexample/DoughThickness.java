package com.test.enumexample;

public enum DoughThickness {
    THIN(30, 1),
    MEDIUM(45, 2),
    THICK(60, 3);

    private double diameter;
    private double thickness;

    DoughThickness(double diameter, double thickness){
        this.diameter = diameter;
        this.thickness = thickness;
    }
    public double getDiameter(){
        return diameter;
    }

    public double getThickness() {
        return thickness;
    }
}
