package Lab3;

public abstract class Dog {
    protected String size;
    protected double tailLength;

    public Dog(){
        size = "Big";
        tailLength = 3;
    }

    public Dog (String siz, double tail){
        size = siz;
        tailLength = tail;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public String getSize() {
        return size;
    }

    abstract String getNature();

    @Override
    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                ", tailLength=" + tailLength +
                '}';
    }
}
