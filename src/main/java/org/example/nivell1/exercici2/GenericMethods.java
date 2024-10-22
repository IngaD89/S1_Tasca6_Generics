package org.example.nivell1.exercici2;

public class GenericMethods <T>{

    T obj1;
    T obj2;
    T obj3;

    public GenericMethods(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public T getObj2() {
        return obj2;
    }

    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }

    public T getObj3() {
        return obj3;
    }

    public void setObj3(T obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}
