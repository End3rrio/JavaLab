package ru.mirea.lub1;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("blue", 7);
        Ball d2 = new Ball("green", 2);
        Ball d3 = new Ball("blue");
        d3.setDiametr(4);
        System.out.println(d1);
        d1.intoUSCMS();
        d2.intoUSCMS();
        d3.intoUSCMS();
    }
}
