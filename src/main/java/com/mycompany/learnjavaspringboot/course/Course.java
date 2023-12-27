package com.mycompany.learnjavaspringboot.course;

public class Course {

    private long id;
    private String courseName;
    private String courseCompany;

    public Course(long id, String courseName, String courseCompany) {
        this.id = id;
        this.courseName = courseName;
        this.courseCompany = courseCompany;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCompany() {
        return courseCompany;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", courseCompany=" + courseCompany + "]";
    }

    
}
