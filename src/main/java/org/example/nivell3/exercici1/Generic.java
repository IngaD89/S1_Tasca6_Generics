package org.example.nivell3.exercici1;

public class Generic {

    public <T extends Phone> void phoneGenericMethod(T phone){
        System.out.println("""
                
                Este metodo es limitado a recibir  datos de\s 
                tipo phone y sus implementaciones.\s
                Puede llamar solo al metodo propio  call().
                A continuación se llamar al metodo call()
                        """

        );
        phone.call();
    }

    public <T extends SmartPhone> void smartPhoneGenericMethod(T smartPhone){
        System.out.println("""
                
                Este metodo es limitado a recibir  datos tipo smartphone y
                puede llamar a los metodos propios y de superclase, 
                en este caso - call() y takePhoto()
                A continuación se llamara a los metodos call() y takePhoto()
                        """

        );
        smartPhone.call();
        smartPhone.takePhoto();
    }
}
