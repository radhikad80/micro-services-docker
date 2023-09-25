package com.restapi.school.client;

import com.restapi.school.Students;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service", url="${application.config.students-url}")
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<Students> findAllStudentsBySchool(@PathVariable("schoolId") Integer schoolId);
}
