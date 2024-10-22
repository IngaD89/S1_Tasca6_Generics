package org.example.nivell1.exercici2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Inga", "Deme", 34);

        GenericMethods<Object> genericMethods = new GenericMethods<>(
                person,
                "Esto es un generico de tipo Object",
                2.3
        );

        GenericMethods<String> stringGenericMethods = new GenericMethods<>(
                person.getLastName(),
                person.getName(),
                "Esto es un generico de tipo String"
        );

        AnotherGenericMethod<Person, String, Boolean> anotherGenericMethod = new AnotherGenericMethod<>(
                new Person("Inga", "Deme", 34),
                "Esto es un generico con tres tipos de datos diferentes",
                true
        );

        System.out.println(genericMethods);
        System.out.println(stringGenericMethods);
        System.out.println(anotherGenericMethod);
    }
}
