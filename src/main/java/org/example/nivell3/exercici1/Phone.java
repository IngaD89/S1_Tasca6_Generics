package org.example.nivell3.exercici1;

public interface Phone {
    default void call(){
        System.out.println("El telefono esta llamando");
    }
}
