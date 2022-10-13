package org.data;

import org.entities.Categories;
import org.entities.Courses;
import org.entities.Instructors;
import org.virtualDataBase.Category;

public class HibernateAccess implements Add {
    public void add(Categories categories) {
        System.out.println("Hibernate ile veri tabanına eklendi.");

    }

    public void add(Instructors instructors) {
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }

    public void add(Courses courses) {
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }

}
