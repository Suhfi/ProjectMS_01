package com.hailxcode.StudentService.controller;

import com.hailxcode.StudentService.model.Student;
import com.hailxcode.StudentService.services.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceImp;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentServiceImp.saveStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentServiceImp.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentServiceImp.getStudentById(id);
    }
    @GetMapping("/school/{schoolId}")
    public List<Student> getStudentsOfSchool(@PathVariable Integer schoolId){
        return studentServiceImp.getStudentsBySchool(schoolId);
    }
}
