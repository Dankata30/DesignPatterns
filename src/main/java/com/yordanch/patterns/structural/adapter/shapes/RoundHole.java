package com.yordanch.patterns.structural.adapter.shapes;

public class RoundHole {
    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg peg){
        return peg.getRadius() <= this.radius;
    }
}
