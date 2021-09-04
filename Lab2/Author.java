package ru.mirea.lub1.Lab2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String n, String em, char gen){
        this.name = n;
        this.email = em;
        this.gender = gen;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }



    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
