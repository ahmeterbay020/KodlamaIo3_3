package org.business;

import org.data.Add;
import org.entities.Categories;
import org.entities.Courses;
import org.entities.Instructors;
import org.logging.Logger;
import org.utilities.Util;
import org.virtualDataBase.Category;

import java.util.List;
import java.util.Objects;

public class Manager {
    private Add add;
    private Logger[] loggers;

    public Manager(Add add, Logger[] loggers) {
        this.add = add;
        this.loggers = loggers;
    }

    public void add(Courses courses, Categories categories, Instructors instructors) {
      /*  List<String> c = new Category().category;
        if (new Util().IsInclude(c, courses.getCourseName())) {
            System.out.println("This course already existed");
        } else {
            add.add(courses);
        }

        if (new Util().IsInclude(c, categories.getCategory())) {
            System.out.println("This course already existed");
        } else {
            add.add(categories);
        }
        add.add(instructors);


    */ add.add(courses);
        add.add(categories);
        add.add(instructors);
}
}
