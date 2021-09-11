package Lab3;

public class Circle extends Shape {

    protected double radius;

    public Circle(){
        radius = 5;
    }

    public Circle(double rad){
        radius = rad;
    }

    public Circle (double rad, String col, boolean fil){
        radius = rad;
        color = col;
        filled = fil;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return getPerimeter() * radius;
    }

    @Override
    double getPerimeter() {
        return 5;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", Perimeter=" + getPerimeter() + '\'' +
                ", Area=" + getArea() +
                '}';
    }
}
