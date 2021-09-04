package ru.mirea.lub1.Lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Toha", "tohapishet@mail.ru", 'M');
        System.out.println(a1);
        a1.setEmail("pishetToha@mail.ru");
        System.out.println(a1);
    }
}
