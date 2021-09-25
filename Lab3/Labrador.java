package Lab3;

public class Labrador extends Dog{
    protected double hight;

    public Labrador (){
        hight = 4.5;
    }

    public Labrador(double hig){
        hight = hig;
    }

    public Labrador(String siz, double tail, double hig){
        size = siz;
        tailLength = tail;
        hight = hig;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    String getNature() {
        return "Calm";
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "hight=" + hight +
                ", size='" + size + '\'' +
                ", tailLength=" + tailLength +
                '}';
    }
}
