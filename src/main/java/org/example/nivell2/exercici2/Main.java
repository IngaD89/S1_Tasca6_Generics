package org.example.nivell2.exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringDataList = new ArrayList<>();
        stringDataList.add("String 1");
        stringDataList.add("String 2");

        GenericList<String> stringGenericList = new GenericList<>(stringDataList);

        System.out.println(stringGenericList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        GenericList<Integer> integerGenericList = new GenericList<>(integerList);

        System.out.println(integerGenericList);
    }
}
