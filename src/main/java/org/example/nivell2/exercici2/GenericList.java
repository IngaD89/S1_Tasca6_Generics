package org.example.nivell2.exercici2;

import java.util.ArrayList;
import java.util.List;

public class GenericList <T>{
    private List<T> undefineData;

    public GenericList() {
        this.undefineData = new ArrayList<>();
    }

    public GenericList(List<T> undefineData) {
        this.undefineData = undefineData;
    }

    public List<T> getUndefineData() {
        return undefineData;
    }

    public void setUndefineData(List<T> undefineData) {
        this.undefineData = undefineData;
    }

    @Override
    public String toString() {
        return "GenericList{" +
                "undefineData=" + undefineData +
                '}';
    }
}
