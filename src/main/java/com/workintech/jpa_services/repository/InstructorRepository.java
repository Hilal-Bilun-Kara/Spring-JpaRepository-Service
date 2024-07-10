package com.workintech.jpa_services.repository;

import com.workintech.jpa_services.entity.Instructor;
import com.workintech.jpa_services.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
