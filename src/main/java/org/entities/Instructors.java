package org.entities;

public class Instructors {
    public Instructors(String instructorName) {
        this.instructorName = instructorName;
    }
    private String instructorName;

    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
