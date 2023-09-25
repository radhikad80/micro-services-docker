package com.restapi.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Schools student){
        service.saveSchool(student);
    }

    @GetMapping
    public ResponseEntity<List<Schools>> findAllSchools(){
       return ResponseEntity.ok(service.findAllSchools());
    }
   /* @GetMapping("/with-students/{schoolId}")
    public ResponseEntity<SchoolWithStudents> findAllSchools(@PathVariable("schoolId") Integer schoolId){
        return ResponseEntity.ok(service.findSchoolswithStudent(schoolId));
    }*/
}
