package Lab4;

public interface Nameable {
    String getName();
}

class Book implements Nameable {

    private String name;

    public Book (String na){
        name = na;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Car implements Nameable {

    private  String name;

    public Car(String na){
        name = na;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

