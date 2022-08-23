package com.cdinuwan.studentsystem.service;

import com.cdinuwan.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public void saveStudent(Student student);
    public List<Student> getAllStudents();
}
