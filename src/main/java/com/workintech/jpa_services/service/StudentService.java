package com.workintech.jpa_services.service;

import com.workintech.jpa_services.entity.Gender;
import com.workintech.jpa_services.entity.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> findAll();

    Student findById(long id);
    List<Student> searchByFirstName(String firstName);
    List<Student> searchByGender(Gender gender);

    Student delete(long id);
}
