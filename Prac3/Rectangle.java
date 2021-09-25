package Prac3;

public class Rectangle extends Shape {

    protected double width;
    protected double length;


    public Rectangle (){
        width = 3;
        length = 4;
    }

    public Rectangle(double wid, double len){
        width = wid;
        length = len;
    }

    public Rectangle(double wid, double len, String col, boolean fil){
        width = wid;
        length = len;
        color = col;
        filled = fil;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    @Override
    double getArea() {
        return (width * length);
    }

    @Override
    double getPerimeter() {
        return ((width + length) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +'\'' +
                ", Area =" + getArea() + '\'' +
                ", Perimeter =" + getPerimeter() +
                '}';
    }
}