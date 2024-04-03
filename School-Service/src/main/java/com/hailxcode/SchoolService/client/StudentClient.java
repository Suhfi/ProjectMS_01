package com.hailxcode.SchoolService.client;

import com.hailxcode.SchoolService.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Student-Service")
public interface StudentClient {
    @GetMapping("students/school/{schoolId}")
    public List<Student> getStudentsOfSchool(@PathVariable Integer schoolId);
}
