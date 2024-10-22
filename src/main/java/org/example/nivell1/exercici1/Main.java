package org.example.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods noGenericMethods = new NoGenericMethods(
                "Inga",
                "Demetrashvili",
                "Femenino"
        );

        NoGenericMethods noGenericMethods1 = new NoGenericMethods(
                "Demetrashvili",
                "Inga",
                "Femenino"
        );

        System.out.println(noGenericMethods);
        System.out.println(noGenericMethods1);
    }
}