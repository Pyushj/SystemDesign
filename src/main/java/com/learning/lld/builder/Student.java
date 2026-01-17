package com.learning.lld.builder;

public class Student {
    private int rollNumber;
    private int age;
    private String name;
    private CourseType courseType;
    private String motherName;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", courseType=" + courseType +
                ", motherName='" + motherName + '\'' +
                '}';
    }

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.motherName = studentBuilder.motherName;
        this.courseType = studentBuilder.courseType;
    }
}
