package com.hailxcode.SchoolService.services;

import com.hailxcode.SchoolService.model.School;

import java.util.List;

public interface SchoolService {
    public School addSchool(School school);
    public List<School> getAllSchools();
    public School getSchoolById(Integer id);
}
