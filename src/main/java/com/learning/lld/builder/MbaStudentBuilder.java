package com.learning.lld.builder;

public class MbaStudentBuilder extends StudentBuilder {

    public StudentBuilder setCourseType() {
        this.courseType = CourseType.MBA;
        return this;
    }
}
