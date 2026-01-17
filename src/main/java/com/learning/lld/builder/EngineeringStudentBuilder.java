package com.learning.lld.builder;

public class EngineeringStudentBuilder extends StudentBuilder {

    public StudentBuilder setCourseType() {
        this.courseType = CourseType.ENGINEERING;
        return this;
    }
}
