package com.hailxcode.SchoolService.controller;

import com.hailxcode.SchoolService.model.School;
import com.hailxcode.SchoolService.services.SchoolServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolServiceImp schoolServiceImp;

    @PostMapping
    public School addSchool(@RequestBody School school){
       return schoolServiceImp.addSchool(school);
    }

    @GetMapping
    public List<School> getAllSchools(){
        return schoolServiceImp.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Integer id){
        return schoolServiceImp.getSchoolById(id);
    }
}
