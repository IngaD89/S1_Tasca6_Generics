package org.example.nivell2.exercici1;

public class GenericAndNonGenericMethod <T>{
    private T obj;
    private String name;

    public GenericAndNonGenericMethod(T obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GenericAndNonGenericMethod{" +
                "obj=" + obj +
                ", name='" + name + '\'' +
                '}';
    }
}
