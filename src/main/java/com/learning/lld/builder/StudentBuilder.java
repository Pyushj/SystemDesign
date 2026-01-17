package com.learning.lld.builder;

public abstract class StudentBuilder {
     int rollNumber;
     int age;
     String name;
     String motherName;
     CourseType courseType;

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setCourseType();

    public Student build() {
        return new Student(this);
    }
}
