package org.example.nivell1.exercici2;

public class Person {
    private String name;
    private String lastName;
    private int ege;

    public Person(String name, String lastName, int ege) {
        this.name = name;
        this.lastName = lastName;
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ege=" + ege +
                '}';
    }
}
