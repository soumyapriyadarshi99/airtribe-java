package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String email, String batch ){
        int studentId = IdGenerator.getNextStudentId();
        Student student = new Student(studentId,firstName,lastName,email,batch);
        students.add(student);
        System.out.println("Student added successfully! ID: " + studentId);
    }
    public Student findById(int id){
        for (Student student : students){
            if(student.getId()== id){
                return student;
            }
        }
        throw new EntityNotFoundException("Student not found with ID: " + id);
    }
    public void listAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            System.out.println("ID: " + student.getId()
                    + " | Name: " + student.getDisplayName()
                    + " | Batch: " + student.getBatch()
                    + " | Active: " + student.isActive());
        }
    }
    public void deactiveStudent(int id){
        Student student = findById(id);
        student.setActive(false);
        System.out.println("Student deactivated: "+ student.getDisplayName());
    }
    public void updateStudent(int id, String firstName, String lastName){
        Student student = findById(id); // reusing findById
        student.setFirstName(firstName);
        student.setLastName(lastName);
        System.out.println("Student with Id: "+id+" updated successfully!");
    }
}
