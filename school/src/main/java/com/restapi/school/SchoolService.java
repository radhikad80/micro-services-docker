package com.restapi.school;

import com.restapi.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;

    //private final StudentClient client;

    public void saveSchool(Schools school){
        repository.save(school);
    }

    public List<Schools> findAllSchools(){
        return repository.findAll();
    }

    /*public SchoolWithStudents findSchoolswithStudent(Integer schoolId){
        Schools school = repository.findById(schoolId)
                            .orElse(Schools.builder()
                                    .name("NOT_FOUND")
                                    .email("NOT_FOUND")
                                    .build());
        List<Students> students = client.findAllStudentsBySchool(schoolId);

        return SchoolWithStudents.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }*/
}
