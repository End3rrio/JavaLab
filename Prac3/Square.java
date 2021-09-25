package Prac3;

import java.awt.*;

public class Square extends Rectangle {
    private double side;


    public Square(){
        side = 4;
    }

    public Square(double si){
        side = si;
    }

    public Square(double si, String col, boolean fil){
        side = si;
        color = col;
        filled = fil;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}