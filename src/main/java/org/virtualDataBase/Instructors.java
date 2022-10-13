package org.virtualDataBase;

import java.util.ArrayList;
import java.util.List;

public class Instructors {
    public static void main(String[] args) {
        new Category().addC("konu yok");
    }
    List<String> instructors = new ArrayList<>();

    public void addC(String string){
        instructors.add(string);
    }
}
