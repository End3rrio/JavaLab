package LAba2;

public class CircleTest {
    public static void main(String[] args) {

        Circle d1 = new Circle(3.5);
        Circle d2 = new Circle();

        d2.setRadius(10);
        d2.setPerimeter();
        d2.setArea();
        System.out.println(d2);

        d1.setPerimeter();
        d1.setArea();

        System.out.println(d1);
    }
}
