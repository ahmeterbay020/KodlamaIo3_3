package org.example;

import org.business.Manager;
import org.data.HibernateAccess;
import org.entities.Categories;
import org.entities.Courses;
import org.entities.Instructors;
import org.logging.DataBaselogger;
import org.logging.FileLogger;
import org.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers ={new FileLogger(),new DataBaselogger()};
        Categories categories = new Categories("Advance");
        Instructors instructors = new Instructors("Engin Demiroğ");
        Courses courses = new Courses("Java Basic",34.99);
        Manager manager = new Manager(new HibernateAccess(),loggers);
        manager.add(courses,categories,instructors);
    }
}