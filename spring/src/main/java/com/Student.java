package com;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Student(){
        super();
    }

    public Student(String studentAddress, int studentId, String studentName) {
        this.studentAddress = studentAddress;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentAddress='" + studentAddress + '\'' +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}