package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;

public class CourseService {
    private ArrayList<Course> courses = new ArrayList<>();
    public void addCourse(String courseName, String description, int durationInWeeks){
        int courseId= IdGenerator.getNextCourseId();
        Course course = new Course(courseId,courseName,description,durationInWeeks);
        courses.add(course);
        System.out.println("Course added successfully! Id: "+courseId);
    }
    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        throw new EntityNotFoundException("Course not found with ID: " + id);
    }

    public void listAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        for (Course course : courses) {
            System.out.println("ID: " + course.getId()
                    + " | Name: " + course.getCourseName()
                    + " | Duration: " + course.getDurationInWeeks() + " weeks"
                    + " | Active: " + course.isActive());
        }
    }

    public void toggleCourseStatus(int id) {
        Course course = findById(id);
        if (course.isActive()) {
            course.setActive(false);
            System.out.println("Course deactivated: " + course.getCourseName());
        } else {
            course.setActive(true);
            System.out.println("Course activated: " + course.getCourseName());
        }
    }
}
