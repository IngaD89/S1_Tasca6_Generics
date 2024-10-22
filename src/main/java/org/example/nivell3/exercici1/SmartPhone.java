package org.example.nivell3.exercici1;

public class SmartPhone implements Phone{

    @Override
    public void call() {
        System.out.println("El smartphone esta llamando");
    }

    public void takePhoto(){
        System.out.println("El smartphone hace fotos");
    }
}
