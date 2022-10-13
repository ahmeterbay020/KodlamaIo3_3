package org.virtualDataBase;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    public static void main(String[] args) {
        new Category().addC("konu yok");
    }
    List<String> courses = new ArrayList<>();

    public void addC(String string) {
        courses.add(string);
    }


}
