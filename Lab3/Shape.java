package Lab3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape (){
        color = ("red");
        filled = false;
    }

    public Shape (String col, boolean fil){
        color = col;
        filled = fil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
