package com.hailxcode.StudentService.services;

import com.hailxcode.StudentService.model.Student;
import com.hailxcode.StudentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
    }

    @Override
    public List<Student> getStudentsBySchool(Integer schoolId) {
        return studentRepository.findBySchoolId(schoolId);
    }
}
