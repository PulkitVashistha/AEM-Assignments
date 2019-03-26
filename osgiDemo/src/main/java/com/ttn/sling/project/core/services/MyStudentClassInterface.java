package com.ttn.sling.project.core.services;

import com.ttn.sling.project.core.services.Student;

import java.util.List;

public interface MyStudentClassInterface {

    void addStudent(Student student);

    void deleteStudent(int id);

    void isStudentPassed(int id);

    void getStudent(int id);

    void getAllStudents();
}
