package org.example.nivell2.exercici1;

public class Main {
    public static void main(String[] args) {
        GenericAndNonGenericMethod<Integer> genericAndNonGenericMethod = new GenericAndNonGenericMethod<>(
                100,
                "Esto es un metodo con datos genericos y no genericos"
        );

        System.out.println(genericAndNonGenericMethod);
    }
}
