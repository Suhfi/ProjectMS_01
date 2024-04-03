package com.hailxcode.StudentService.services;

import com.hailxcode.StudentService.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public List<Student> getStudentsBySchool(Integer schoolId);
}
