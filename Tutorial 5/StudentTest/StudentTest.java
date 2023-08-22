package com.mycompany.studenttest;

public class StudentTest {

    public static void main(String[] args) {
        Student objStudent1 = new Student();
        Student objStudent2 = new Student("1001", "Abdul Rahman", "Active");
        
        System.out.println("Student ID     : " + objStudent2.getStudentID());
        System.out.println("Student Name   : " + objStudent2.getStudentName());
        System.out.println("Student Status : " + objStudent2.getStudentStatus());
    }
}
