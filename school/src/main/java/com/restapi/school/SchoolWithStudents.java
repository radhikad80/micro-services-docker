package com.restapi.school;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolWithStudents {
    private String name;
    private String email;
    List<Students> students;
}
