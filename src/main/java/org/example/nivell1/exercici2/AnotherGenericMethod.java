package org.example.nivell1.exercici2;

public class AnotherGenericMethod <T, V, A>{
    private T objT;
    private V objV;
    private A objA;

    public AnotherGenericMethod(T objT, V objV, A objA) {
        this.objT = objT;
        this.objV = objV;
        this.objA = objA;
    }

    public T getObjT() {
        return objT;
    }

    public void setObjT(T objT) {
        this.objT = objT;
    }

    public V getObjV() {
        return objV;
    }

    public void setObjV(V objV) {
        this.objV = objV;
    }

    public A getObjA() {
        return objA;
    }

    public void setObjA(A objA) {
        this.objA = objA;
    }

    @Override
    public String toString() {
        return "AnotherGenericMethod{" +
                "objT=" + objT +
                ", objV=" + objV +
                ", objA=" + objA +
                '}';
    }
}
