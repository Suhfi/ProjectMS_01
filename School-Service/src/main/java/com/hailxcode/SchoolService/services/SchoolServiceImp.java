package com.hailxcode.SchoolService.services;

import com.hailxcode.SchoolService.client.StudentClient;
import com.hailxcode.SchoolService.model.School;
import com.hailxcode.SchoolService.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImp implements SchoolService{

    @Autowired
    private SchoolRepository repository;

    @Autowired
    private StudentClient studentClient;
    @Override
    public School addSchool(School school) {
        return repository.save(school);
    }

    @Override
    public List<School> getAllSchools() {
        List<School> schools = repository.findAll();
        schools.forEach(school -> school.setStudents(studentClient.getStudentsOfSchool(school.getId())));
        return schools;
    }

    @Override
    public School getSchoolById(Integer id) {
        School school = repository.findById(id).orElseThrow(()-> new RuntimeException("School not found"));
        school.setStudents(studentClient.getStudentsOfSchool(school.getId()));
        return school;
    }
}
