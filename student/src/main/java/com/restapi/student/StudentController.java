package com.restapi.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Students student){
        service.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Students>> getStudents(){
       return ResponseEntity.ok(service.findAllStudents());
    }

    //create method to update student
    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Students student, @PathVariable("id") Integer id){
        service.updateStudent(student, id);
    }

    @GetMapping("/school/{schoolId}")
    public ResponseEntity<List<Students>> findAllStudents(@PathVariable("schoolId") Integer schoolId){
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
    }
}
