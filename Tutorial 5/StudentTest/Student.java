package com.mycompany.studenttest;

public class Student {
    private String studentID;
    private String studentName;
    private String studentStatus;

    public Student() {
        System.out.println("Student Class");
        System.out.println("=============");
        System.out.println(" ");
    }

    public Student(String id, String name) {
        setStudentID(id);
        setStudentName(name);
    }
    
    public Student(String id, String name, String status) {
        setStudentID(id);
        setStudentName(name);
        setStudentStatus(status);
    }

    public String getStudentID() {
        return (this.studentID);
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public String getStudentName() {
        return (this.studentName);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStatus() {
        return (this.studentStatus);
    }
    
    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }  
}