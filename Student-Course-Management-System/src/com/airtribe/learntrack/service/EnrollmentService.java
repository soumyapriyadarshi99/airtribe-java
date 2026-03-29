package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.time.LocalDate;
import java.util.ArrayList;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public void enroll(int studentId, int courseId) {
        int enrollmentId = IdGenerator.getNextEnrollmentId();
        String date = LocalDate.now().toString(); // gives today's date like "2026-03-30"
        Enrollment enrollment = new Enrollment(enrollmentId, studentId, courseId, date);
        enrollments.add(enrollment);
        System.out.println("Student enrolled successfully! Enrollment ID: " + enrollmentId);
    }

    public void listEnrollmentsForStudent(int studentId) {
        boolean found = false;
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudentId() == studentId) {
                System.out.println("Enrollment ID: " + enrollment.getId()
                        + " | Course ID: " + enrollment.getCourseId()
                        + " | Date: " + enrollment.getEnrollmentDate()
                        + " | Status: " + enrollment.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No enrollments found for Student ID: " + studentId);
        }
    }

    public void updateStatus(int enrollmentId, String status) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getId() == enrollmentId) {
                enrollment.setStatus(status);
                System.out.println("Enrollment status updated to: " + status);
                return; // stop looping once found
            }
        }
        throw new EntityNotFoundException("Enrollment not found with ID: " + enrollmentId);
    }
}