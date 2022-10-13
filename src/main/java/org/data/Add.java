package org.data;

import org.entities.Categories;
import org.entities.Courses;
import org.entities.Instructors;

public interface Add {
    void add(Categories categories);
    void add(Instructors instructors);
    void add(Courses courses);

}
