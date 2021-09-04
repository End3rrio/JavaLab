package ru.mirea.lub1.Lab1;

public class Ball {
    private String collor;
    private int diametr;

    public Ball(String col, int dia) {
        collor = col;
        diametr = dia;
    }

    public Ball(String col) {
        collor = col;
        diametr = 5;
    }

    public Ball(){
        collor = "red";
        diametr = 5;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public String getCollor() {
        return collor;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "collor='" + collor + '\'' +
                ", diametr=" + diametr +
                '}';
    }

    public void intoUSCMS(){
        System.out.println(diametr+" in USCMS "+diametr*0.394+" inches");
    }
}



