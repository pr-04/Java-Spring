package com.example;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showDetails() {
        System.out.println("Student details:");
        course.displayCourse();
    }
}
