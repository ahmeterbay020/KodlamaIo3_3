package org.data;

import org.entities.Categories;
import org.entities.Courses;
import org.entities.Instructors;
import org.virtualDataBase.Category;

public class JdbcAccess implements Add {

    @Override
    public void add(Categories categories) {
        System.out.println("JDBC ile veri tabnına eklendi.");
        new Category().category.add(categories.getCategory());
    }

    @Override
    public void add(Instructors instructors) {
        System.out.println("JDBC ile veri tabnına eklendi.");
    }

    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile veri tabnına eklendi.");
    }
}
