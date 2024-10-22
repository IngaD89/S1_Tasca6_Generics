package org.example.nivell3.exercici1;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone() {
            @Override
            public void call() {
                Phone.super.call();
            }
        };

       SmartPhone smartPhone = new SmartPhone();
       Generic generic = new Generic();
       generic.phoneGenericMethod(smartPhone);
       generic.smartPhoneGenericMethod(smartPhone);
       generic.phoneGenericMethod(phone);
    }
}
