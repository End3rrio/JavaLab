package LAba2;

public class Circle {
    private double radius;
    private double perimeter;
    private double area;

    public Circle(){
        radius = 5;
    }

    public Circle(double rad){
        radius = rad;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPerimeter(){
        this.perimeter = Math.PI * 2 * radius;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea() {
        this.area = Math.PI * (radius * radius);
    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
