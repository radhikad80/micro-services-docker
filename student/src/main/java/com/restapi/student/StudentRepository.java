package com.restapi.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students,Integer> {

    List<Students> findAllBySchoolId(Integer schoolId);
}
