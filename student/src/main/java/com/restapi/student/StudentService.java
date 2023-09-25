package com.restapi.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudent(Students student){
        repository.save(student);
    }

    public List<Students> findAllStudents(){
        return repository.findAll();
    }

    public List<Students> findAllStudentsBySchool(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }

    public void updateStudent(Students student, Integer id) {
        repository.save(student);
    }

    // method to save data to aws S3
    // @S3Upload
    // @S3Upload(bucketName = "student-bucket")


    public void saveToS3(Students student)
    {
        repository.save(student);
    }
}
